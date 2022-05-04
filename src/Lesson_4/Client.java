package Lesson_4;

public class Client extends Thread {

    public String name;
    public CallCenter callCenter;

    public Client(String name, CallCenter callCenter) {
        this.callCenter = callCenter;
        this.name = name;
    }


    public CallCenter getCallCenter() {
        return callCenter;
    }

    public void setCallCenter(CallCenter callCenter) {
        this.callCenter = callCenter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        return callCenter != null ? callCenter.equals(client.callCenter) : client.callCenter == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (callCenter != null ? callCenter.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", callCenter=" + callCenter +
                '}';
    }

    @Override
    public void run() {
        Operator operator = callCenter.takeOperator();
        while (operator == null) {
            operator = callCenter.takeOperator();
        }
        operator.takeCall();
        callCenter.returnOperator(operator);
    }
}

