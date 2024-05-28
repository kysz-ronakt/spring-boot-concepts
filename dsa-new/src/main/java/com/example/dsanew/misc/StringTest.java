package com.example.dsanew.misc;

public class StringTest {
    public static void main(String[] args) {
        boolean abcdef = isSpecial("ab1221ba");
        System.out.println("abcdef = " + abcdef);
    }

    public static boolean isSpecial(String text) {
        String tempText = alterText(text);
        return text.equals(tempText);
    }

    public static String alterText(String inputText) {
        if(inputText == null || inputText.isEmpty()) {
            return inputText;
        }
        return inputText.charAt(inputText.length() - 1) +
                alterText(inputText.substring(0, inputText.length() - 1));
    }
}
