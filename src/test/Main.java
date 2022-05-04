package test;

import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    static LinkedBlockingQueue<Boolean> callsQueue = new LinkedBlockingQueue<>();
    static boolean endNewCalls = false;

    public static void main(String[] args) throws InterruptedException {
        ATC atc = new ATC();
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        atc.start();
        worker1.start();
        worker2.start();

    }

    static class ATC extends Thread {

        @Override
        public void run() {
            int noCall = 1000;
            int maxCalls = 60;
            for (int i = 0; i < maxCalls; i++) {
                try {
                    System.out.println("Новый звонок!");
                    callsQueue.offer(true);
                    sleep(noCall);
                } catch (InterruptedException e) {
                }
            }
            System.out.println("Звонков больше не будет!");
            endNewCalls = true;
        }
    }

    static class Worker extends Thread {
        @Override
        public void run() {
            int working = 3000;
            while (true) {
                if (endNewCalls && callsQueue.isEmpty()) break;
                try {
                    if (!callsQueue.isEmpty()) {
                        callsQueue.take();
                        System.out.println("Работник начал обрабатывать звонок");
                        sleep(working);
                        callsQueue.poll();
                        System.out.println("Работник обработал звонок");
                    }
                } catch (InterruptedException e) {
                }
            }

            System.out.println("Работник пошел домой");
        }

    }


}