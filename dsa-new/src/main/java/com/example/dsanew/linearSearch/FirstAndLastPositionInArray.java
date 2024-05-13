package com.example.dsanew.linearSearch;

import java.util.Arrays;

//find the first and last element in array for the sorted array
public class FirstAndLastPositionInArray {

    //    steps:
    /*
     *   1. find first occurrence of 7
     *   2. if middleElement == targetElement then apply binary search there again , don't return mid
     *   3. do end = mid-1 and start = mid +1 ;
     *   4.incase of nothing found then return array[-1, -1]
     *
     *
     *
     * */
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 6; //start position = 5, end position = 7

        int[] firstAndLastPositionInArray = searchRange(arr, target);
        System.out.println("firstAndLastPositionInArray = " + Arrays.toString(firstAndLastPositionInArray));
    }


    public static int[] searchRange(int[] nums, int target) {


        int[] answer = {-1, -1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        answer[0] = start;
        answer[1] = end;

        return answer;
    }


    /**
     * this function returns the index value of target
     *
     * @param
     * @author ronak-springboot-dev
     */
    static int search(int[] arr, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = arr.length - 1;


        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                if (target == arr[mid]) {
                    ans = mid;

                    if (findStartIndex) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }
        return ans;
    }
}
