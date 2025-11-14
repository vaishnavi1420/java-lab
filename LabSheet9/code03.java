package LabSheet9;

public class code03 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread Name: " + t.getName());
        System.out.println("Current Thread Priority: " + t.getPriority());
    }
}
