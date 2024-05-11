package com.example.dsanew.linearSearch;

public class FindMin {

    public static void main(String[] args) {

        System.out.println(findMin(new int[]{100, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }


    //return mininum value
    static int findMin(int[] numbers) {

        int ans = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < ans) {
                ans = numbers[i];
            }
        }
        return ans;
    }
}
