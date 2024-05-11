package com.example.dsanew.workaround;

public class TestOTG {

    public static void main(String[] args) {
        print(4);
    }

    public static  void print(int n){
        for(int i =1; i<=n ; i++){
            for(int j=1; j<=n; j+=1){
                System.out.println("*");
            }
        }


    }
}
