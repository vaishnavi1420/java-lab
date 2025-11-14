package LabSheet9;

public class code14 {
    public static <T> void printArray(T[] arr) {
        for (T element : arr)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        String[] names = {"Lavina", "Ankush", "Gesu"};
        Integer[] nums = {1, 2, 3, 4};

        printArray(names);
        printArray(nums);
    }
}
