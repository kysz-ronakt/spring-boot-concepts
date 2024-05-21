package com.example.dsanew.misc;

public class TryCatch {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Inside catch block" + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
