package LabSheet9;

class SharedResource {
    private boolean available = false;

    synchronized void produce() {
        while (available) {
            try { wait(); } catch (InterruptedException e) { }
        }
        System.out.println("Produced an item");
        available = true;
        notify();
    }

    synchronized void consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) { }
        }
        System.out.println("Consumed an item");
        available = false;
        notify();
    }
}

public class code09 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) resource.produce();
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) resource.consume();
        });

        producer.start();
        consumer.start();
    }
}
