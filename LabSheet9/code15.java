package LabSheet9;

class PairData<K, V> {
    private K key;
    private V value;

    PairData(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void show() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class code15 {
    public static void main(String[] args) {
        PairData<String, String> p = new PairData<>("Name", "Lavina");
        p.show();
    }
}

