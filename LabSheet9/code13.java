package LabSheet9;

class Pair<A, B> {
    A first;
    B second;

    Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}

public class code13 {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Age", 22);
        p1.display();
    }
}
