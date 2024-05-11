package com.example.dsanew.recursionAndBacktracking;

public class GenerateStrings {
    static int[] A = new int[] {2,5,3,4,1};

    public static void main(String[] args) {
        System.out.println(Binary(5));
    }
    public static boolean Binary(int n){
        if (n<1){
            System.out.println(A);
        }else{
            A[n-1] = 0;
            Binary(n-1);
            A[n-1] =1 ;
            Binary(n-1);
        }
        return false;
    }
}
