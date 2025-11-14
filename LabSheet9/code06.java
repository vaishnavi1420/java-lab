package LabSheet9;

public class code06 extends Thread {
    public void run() {
        try {
            System.out.println("Thread going to sleep for 2 seconds...");
            Thread.sleep(2000);
            System.out.println("Thread woke up!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        code06 t = new code06();
        t.start();
    }
}
