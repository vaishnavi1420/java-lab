package LabSheet9;

import java.util.*;

public class code19 {
    // ? extends Number — can take Integer, Double, etc.
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // ? super Integer — can take Integer or its superclasses (Number, Object)
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        printNumbers(intList);

        List<Number> numList = new ArrayList<>();
        addNumbers(numList);
        System.out.println(numList);
    }
}
