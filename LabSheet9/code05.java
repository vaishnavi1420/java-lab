package LabSheet9;

class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Thread A: " + i);
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++)
            System.out.println("Thread B: " + i);
    }
}

public class code05 {
    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
    }
}
