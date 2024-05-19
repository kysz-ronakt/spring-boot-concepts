package com.example.dsanew.sorting;

/*
 *   -> Bubble sort is comparison sorting method
 *   -> we'll try something at every step
 *   -> In every step we're comparing elements
 *   -> compare every element and swap it
 *
 * why bubble sort ?
 * 1)  with the first pass through the array the largest element came in the end
 * 2)  second large element in second pass come at the second last position
 *
 *        array =  {5,4,3,1,2 }
 *
 *      1] for the very first time the biggest element will come at last in array
 *              {5,4,3,1,2 } -> {4,3,1,2,5}
 *      2] for the second time the biggest element come at second last in array except previous element
 *              {4,3,1,2,5} -> {3,1,2,4,5}
 *      3] for the third time the biggest element come at third last in array except previous two elements
 *              {3,1,2,4,5} -> {1,2,3,4,5}
 *
 *                 i  j
 *      index =    0, 1, 2, 3,  4
 *      array =  { 5 ,4 ,3 ,1 , 2 }
 *
 *  1) if j < j-1 then swap
 *  2) increase J value by 1
 *  3) j will only check unsorted part of array
 *
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Bubble/syncing/exchange sort
 * */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(3);
        integerList.add(1);
        integerList.add(4);
        integerList.add(2);

        bubbleSort(integerList);
        System.out.println("integerList = " + integerList);
      /*  bubbleSort(arr);
        System.out.println("Arrays.toString( = " + Arrays.toString(arr));*/
    }

    static void bubbleSort(int[] arr) {

        //run the steps n-1 time

        for (int i = 0; i < arr.length; i++) {

            //for each step, max element come at the last respective index as I have described above

            for (int j = 1; j <= arr.length - i - 1/*or j < arr.length-1*/; j++) {

                //swap if item is smaller than previous item
                if (arr[j] < arr[j - 1]) {

//                    {5,4,3,1,2 }
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    static void bubbleSort(List<Integer> a) {
        int swapCount = 0; // Counter for swaps

        for (int i = 0; i < a.size(); i++) {
            boolean swapped = false; // Flag to check if any swap happens

            for (int j = 0; j < a.size() - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    // Swap elements
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    swapCount++; // Increment swap counter
                    swapped = true; // Set flag to true as swap happened
                }
            }

            // If no swap happened in this pass, array is sorted
            if (!swapped) {
                break;
            }
        }

        // Print required details
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
    }



    /*static void bubbleSort(List<Integer> arr) {

        for (int i = 0; i < arr.size() - 1; i++) {

            for (int j = 0; j < arr.size() - i - 1; j++) {

                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }*/

}
