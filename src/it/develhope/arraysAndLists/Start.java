package it.develhope.arraysAndLists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        System.out.println("--------------Creating an array of cars-----------------------");

        String[] carBrands = new String[]{"Fiat", "BMW", "Mercedes", "Volkswagen", "Toyota"};
        System.out.println("The number of items of carBrands array is " + carBrands.length);
        System.out.println("The third item of the carBrands array is " + carBrands[2]);

        System.out.println("---------------Creating an array of prime numbers--------------");

        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;
        System.out.println("These are the contents of the primeNumbers array: " + Arrays.toString(primeNumbers));

        System.out.println("---------------------------------------------------------------");

    }
}
