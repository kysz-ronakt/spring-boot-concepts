package com.dev.dsa.linearSearch;

public class Linear_search_in_range {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(linearSearch(array, 5, 2, 6));
    }
    static int linearSearch(int[] array, int target, int start , int end) {
        if (array.length == 0) {
            return -1;
        }


        //check for target
        for (int i = start; i <= end; i++) {

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
