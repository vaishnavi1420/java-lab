package LabSheet9;

public class code16 {
    public static <T extends Number> double sum(T[] numbers) {
        double total = 0;
        for (T n : numbers) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Double[] doubles = {2.5, 3.5, 4.0};

        System.out.println("Sum of Integers: " + sum(nums));
        System.out.println("Sum of Doubles: " + sum(doubles));
    }
}
