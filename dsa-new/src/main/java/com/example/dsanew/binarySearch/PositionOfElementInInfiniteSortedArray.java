package com.example.dsanew.binarySearch;

public class PositionOfElementInInfiniteSortedArray {


    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        int answer = getAnswer(arr, target);
        System.out.println("answer = " + answer);
    }


    public static int getAnswer(int[] nums, int target) {

        /*
         * @author ronak-springboot-dev
         *
         * 1. find start point and endpoint first
         * 2. If target is not found inside then increase the gap exponentially
         *
         * */

        int start = 0;
        int end = 1; // we can't do nums.length-1 here because we don't know end , array is infinite.


        while (target > nums[end]) {

            int newStart = end + 1; // this is temp variable to swap the values

            //double the range value
            //end = end  + sizeOfBox*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return positionOfInfiniteSortedArrayUsingBinarySearch(nums, target, start, end);
    }

    public static int positionOfInfiniteSortedArrayUsingBinarySearch(int[] nums, int target, int start, int end) {


        while (start <= end) {


            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            if (target < nums[mid]) {
                return mid - 1;
            } else if (target > nums[mid]) {
                return mid + 1;
            }
        }

        return -1;
    }
}
