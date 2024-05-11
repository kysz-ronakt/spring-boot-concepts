package com.example.dsanew.recursionAndBacktracking;

public class TOH {
    public static void main(String[] args) {
        int numberOfDisks = 3; // Change the number of disks as needed
        char fromRod = 'A'; // Name of the starting rod
        char toRod = 'C'; // Name of the destination rod
        char auxiliaryRod = 'B'; // Name of the auxiliary rod

        System.out.println("Initial configuration:");
        System.out.println("Number of disks: " + numberOfDisks);
        System.out.println("Starting rod: " + fromRod);
        System.out.println("Destination rod: " + toRod);
        System.out.println("Auxiliary rod: " + auxiliaryRod);

        System.out.println("\nSteps to solve the Towers of Hanoi problem:");
        towersOfHanoi(numberOfDisks, fromRod, toRod, auxiliaryRod);
    }




    public static  void towersOfHanoi(int n,  char from, char to , char auxilary){

        if (n==1){
            return;
        }

        // move from a to b
        towersOfHanoi(n-1, from, auxilary, to);
        System.out.println("after moving from a to b : " + "from "+ from + " auxilary "+ auxilary + " to "+ to);

        // move from b to c
        towersOfHanoi(n-1, auxilary, to, from);
        System.out.println("after moving from b to c : " + "auxilary "+ auxilary + " to "+ to + " from "+ from);



    }
}
