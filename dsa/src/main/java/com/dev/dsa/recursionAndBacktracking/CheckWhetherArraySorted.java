package com.dev.dsa.recursionAndBacktracking;

public class CheckWhetherArraySorted {

    public static void main(String[] args) {


        System.out.println(sortArrayWithRecursion(new int[]{5, 2, 4, 3, 1}, 2));
    }

    public static boolean sortArrayWithRecursion(int[] array, int index) {


        if (array.length == 1) return true;
//        return (array[index - 1] <= array[index - 2]) ? 0 : sortArrayWithRecursion(array, index - 1);


        if (array[index - 1] >= array[index - 2]) {
            return sortArrayWithRecursion(array, index - 1);
        } else {
            return false;
        }
    }
}
