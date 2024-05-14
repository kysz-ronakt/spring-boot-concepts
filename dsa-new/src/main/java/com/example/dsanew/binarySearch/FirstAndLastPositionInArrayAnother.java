package com.example.dsanew.binarySearch;

import java.util.Arrays;

public class FirstAndLastPositionInArrayAnother {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;

        int[] ints = search(arr, target);
        System.out.println("ints = " + Arrays.toString(ints));
    }

    static int[] search(int[] arr, int target) {

        int[] ans = {-1, -1};
        int startIndex = search(arr, target, true);
        int endIndex = search(arr, target, false);

        ans[0] = startIndex;
        ans[1] = endIndex;

        return ans;
    }


    static int search(int[] arr, int target, boolean startIndex) {

        int ans = -1;

        int start = 0;
        int end = arr.length - 1;


        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {

            return end = mid - 1;
        } else if (target > arr[mid]) {
            return start = mid + 1;
        } else {

            ans = mid;

            if (startIndex) {
                return end = mid - 1;
            } else {
                return start = mid + 1;
            }

        }
    }
}
