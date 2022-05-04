package Lesson_4;

import java.util.Random;

class RandomClient extends Thread {

    public CallCenter callCenter;
    public static String[] CLIENTS_NAMES = {"Slava", "Dima", "Danil", "Kolya", "Alex"};

    public CallCenter getCallCenter() {
        return callCenter;
    }

    public void setCallCenter(CallCenter callCenter) {
        this.callCenter = callCenter;
    }

    public static String[] getClientsNames() {
        return CLIENTS_NAMES;
    }

    public static void setClientsNames(String[] clientsNames) {
        CLIENTS_NAMES = clientsNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RandomClient that = (RandomClient) o;

        return callCenter != null ? callCenter.equals(that.callCenter) : that.callCenter == null;
    }

    @Override
    public int hashCode() {
        return callCenter != null ? callCenter.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "RandomClient{" +
                "callCenter=" + callCenter +
                '}';
    }

    public RandomClient(CallCenter callCenter) {
        this.callCenter = callCenter;
    }

    @Override
    public void run() {
        Random rand = new Random();
        super.run();
        for (; ; ) {
            try {
                sleep(rand.nextInt(5)*500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Client client = new Client(CLIENTS_NAMES[rand.nextInt(CLIENTS_NAMES.length)], callCenter);

            System.out.println("Звонок от клиента " + client.name);
            new Thread(client, client.name).start();
        }
    }
}
