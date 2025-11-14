package LabSheet9;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class code11 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.set("Hello Generics!");
        System.out.println("Box contains: " + b1.get());
    }
}
