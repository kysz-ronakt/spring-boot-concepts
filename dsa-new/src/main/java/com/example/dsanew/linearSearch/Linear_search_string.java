package com.example.dsanew.linearSearch;

public class Linear_search_string {

    public static void main(String[] args) {


        String name = "Ronak";

        System.out.println(searchStringChar(name, 'a'));
        System.out.println(searchStringChar2(name, 'r'));

    }


    //character to search
    static boolean searchStringChar(String string, char target) {


        if (string.isEmpty()) {
            return false;
        }

        for (int i = 0; i <= string.length(); i++) {

            //returns the character value specified index
            if (target == string.charAt(i)) {
                return true;
            }
        }

        return false;
    }


    static boolean searchStringChar2(String string, char target) {


        if (string.isEmpty()) {
            return false;
        }

        for (char ch : string.toCharArray()) {

            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
