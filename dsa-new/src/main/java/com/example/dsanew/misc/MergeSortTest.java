package com.example.dsanew.misc;

import static java.io.ObjectInputFilter.merge;

public class MergeSortTest {

    public static void main(String[] args) {

    }



    public int[] sort(int[] numbers, int length) {
        if (length < 2) {
            return numbers;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = numbers[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = numbers[i]; // Populate the right array starting from index 'mid'
        }

        sort(left, mid);
        sort(right, length - mid);

//        return merge(numbers, left, right, mid, length - mid);
        return null;
    }

}
