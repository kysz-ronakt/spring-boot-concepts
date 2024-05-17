package com.example.dsanew.binarySearch;

public class MountainArray {
    //    https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {

    }

    public  int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;


        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {

                //now you're in decreasing part of an array , so this may be your answer or look on the left side
                //this may be our answer and that is why it is not end = mid-1;
                end = mid;

            } else {
                //you are in ascending part of the array
                start = mid + 1; //because we know that mid+1 > mid

            }
        }
        //in the end start == end
        //because everytime start and end is trying to find max element for that position
        return start;
    }
}
