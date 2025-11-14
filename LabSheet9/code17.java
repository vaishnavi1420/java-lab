package LabSheet9;

interface Container<T> {
    void add(T item);
    T get();
}

class MyContainer<T> implements Container<T> {
    private T value;

    public void add(T item) {
        this.value = item;
    }

    public T get() {
        return value;
    }
}

public class code17 {
    public static void main(String[] args) {
        MyContainer<String> c1 = new MyContainer<>();
        c1.add("Hello World");
        System.out.println("Container holds: " + c1.get());
    }
}
