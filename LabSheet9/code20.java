package LabSheet9;

import java.util.*;

public class code20 {
    public static <T extends Comparable<T>> int countGreater(List<T> list, T element) {
        int count = 0;
        for (T item : list) {
            if (item.compareTo(element) > 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 5, 30, 25);
        System.out.println("Numbers greater than 15: " + countGreater(nums, 15));
    }
}
