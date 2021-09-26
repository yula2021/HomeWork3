package com.company;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
      Random rnd  = new Random();
        int [] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array [i] = rnd.nextInt(100);
        }
        Arrays.sort(array);
        System.out.println("Incoming data: " + Arrays.toString(array));
        int min = array[0];
        int max = array[array.length-1];
        StringBuilder result = new StringBuilder();
        for (int i = min; i < max; i++) {
            boolean isConstains = false;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    isConstains = true;
                }
            }
            if (!isConstains) {
                result.append(result.length() > 0 ? " ": "").append(i);
            }
        }
        System.out.printf("Result: %s", result);
    }
}
