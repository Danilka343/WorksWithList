package Lesson_4;


import java.util.LinkedList;

public class CallCenter {

    private LinkedList<Operator> operators;

    public CallCenter(LinkedList<Operator> operators) {
        this.operators = operators;
    }

    public LinkedList<Operator> getOperators() {
        return operators;
    }

    public void setOperators(LinkedList<Operator> operators) {
        this.operators = operators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CallCenter that = (CallCenter) o;

        return operators != null ? operators.equals(that.operators) : that.operators == null;
    }

    @Override
    public int hashCode() {
        return operators != null ? operators.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CallCenter{" +
                "operators=" + operators +
                '}';
    }


    public synchronized Operator takeOperator() {
        Operator operator = operators.poll();

        while (operator == null) {
            try {
                System.out.println("Ожидайте свободного оператора.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return operator;
    }

    public synchronized void returnOperator(Operator operator) {
        operators.add(operator);
        System.out.println("Звонок c " + Thread.currentThread().getName() + " завершен. Оператор " + operator.name + " освободился");
        notify();
    }
}