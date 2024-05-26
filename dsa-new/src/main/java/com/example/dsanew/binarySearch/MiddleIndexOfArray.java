package com.example.dsanew.binarySearch;

public class MiddleIndexOfArray {

    //    https://leetcode.com/problems/find-the-middle-index-in-array/description/
    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] arr = {2, 3, -1, 8, 4};
        int[] arr = {2, 5,4,7, 8};
        int middleIndex = findMiddleIndex(arr);
        System.out.println("middleIndex = " + middleIndex);
    }

    public static int findMiddleIndex(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < 0) {
                return mid + 1;
            } else if (nums[mid] == 0) {
                return mid;
            }else {
                return -1;
            }
        }
        return -1;
    }
}
