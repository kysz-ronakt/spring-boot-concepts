package com.example.dsanew.binarySearch;

public class SearchInMountain {

    /*
     * 1. find peak element
     * 2. binary search in ascending in array
     * 3. if not found then binary search on second array i.e. decreasing array
     *
     * LC = 1095
     * */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 6, 5, 4};
        int target = 8;
        int i = searchInMountain(arr, target);
        System.out.println("i = " + i);


    }

    static int searchInMountain(int[] nums, int target) {

        int peak = peakIndexInMountainArray(nums);
        System.out.println("peak = " + peak);
        int firstTry = orderAgnosticBS(nums, target, 0, peak);
        System.out.println("firstTry = " + firstTry);

        if (firstTry != -1) {
            return firstTry;
        }
        //else try to search on second half
        return orderAgnosticBS(nums, target, peak + 1, nums.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {

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

    static int orderAgnosticBS(int[] nums, int target, int start, int end) {

        //find whether array is in ascending or descending order


        boolean isAscending = nums[start] < nums[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Check if the target is found
            if (nums[mid] == target) {
                return mid;
            }


            if (isAscending) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid]) {

//                   if your target is > mid then it will be  on left side in descending array
                    end = mid - 1;

                } else {
                    start = mid + 1;

                }
            }

        }
        return -1;

    }
}
