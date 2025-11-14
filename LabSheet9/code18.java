package LabSheet9;

class ComparableBox<T extends Comparable<T>> {
    private T value;

    ComparableBox(T value) {
        this.value = value;
    }

    boolean isGreater(T other) {
        return value.compareTo(other) > 0;
    }
}

public class code18 {
    public static void main(String[] args) {
        ComparableBox<Integer> b1 = new ComparableBox<>(50);
        System.out.println("Is 50 greater than 30? " + b1.isGreater(30));
    }
}

