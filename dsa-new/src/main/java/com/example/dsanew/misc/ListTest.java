package com.example.dsanew.misc;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> integerList = someFunction(List.of(5, 8, 9, 1, 3, 4));
        System.out.println("integerList = " + integerList);

    }

    public static List<Integer> someFunction(final List<Integer> numbers) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            result.add(numbers.get(i));
        }
        return result;
    }
}
