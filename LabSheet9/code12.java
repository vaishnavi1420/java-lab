package LabSheet9;

public class code12 {
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4};
        swap(nums, 1, 3);

        for (int n : nums)
            System.out.print(n + " ");
    }
}
