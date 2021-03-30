package com.timbuchalka;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {
	    int[] myIntArray = new int [5];
	    myIntArray[0] = 50;
	    myIntArray [1] = 23;
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);

        String[] myStringArray = new String[5];
        myStringArray[0] = "Hello";
        myStringArray[1] = "Mr. Robot";
        myStringArray[2] = "Banana";
        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);

        String[] countries = {"Argentina", "Chile", "Brasil", "Paraguay", "Uruguay", "Colombia"};
        System.out.println(countries[4]);

        for (int i = 0; i< countries.length; i++) {
            System.out.println("Element " + i + " Country: " + countries[i] );
        }

        System.out.println();

        String[] programmingLanguages = {"Python", "Java", "Rust", "JavaScript", "Go"};
        printArray(programmingLanguages);

        int[] myIntegers = getIntegers(5);
        for (int i=0; i< myIntegers.length; i ++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The avereage is " + getAverage(myIntegers));



    }

    public static void printArray(String[] array) {
        for (int i = 0; i< array.length; i++) {
            System.out.println("Element " + i + " Programming Languages: " + array[i] );
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");

        int[] values = new int[number];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i=0; i< array.length; i++) {
            sum += array[i];
        }

        return (double)sum / (double)array.length;
    }
}
