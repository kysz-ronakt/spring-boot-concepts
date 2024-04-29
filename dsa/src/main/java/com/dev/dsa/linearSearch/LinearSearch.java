package com.dev.dsa.linearSearch;

public class LinearSearch {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(linearSearch(array, 10));
    }

    //search in array : return index if item is found
    //else return -1
    static int linearSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }


        //check for target
        for (int i = 0; i < array.length; i++) {

            //check for element at every index
            int element = array[i];
            if (element == target) {
                return i;
            }
        }
        // this line will execute if none of return statement of above executed
        return -1;
    }

}
