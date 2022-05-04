package Lesson_4;

import java.util.LinkedList;

public class testCallCenter {
        public static void main(String[] args) {
            LinkedList<Operator> operators = new LinkedList<>();
            Operator operator1 = new Operator("Alisa (1)");
            Operator operator2 = new Operator("Karina (2)");
            Operator operator3 = new Operator("Nastya (3)");
            operators.add(operator1);
            operators.add(operator2);
            operators.add(operator3);
            CallCenter callCenter = new CallCenter(operators);
            RandomClient randClients = new RandomClient(callCenter);
            new Thread(randClients).start();
        }
    }
