package com.individual.basicos;

import java.util.Arrays;
import java.util.Random;

public class ManipulacaoArray {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] integerArray = rd.ints(1000, 0, 1000000).toArray();
        String[] stringArray = intToString(integerArray);
        stringToInt(stringArray);
        forStringToInt(stringArray);
    }

    public static void stringToInt(String[] stringArray){
        long starTime = System.nanoTime();
        int[] integerArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
        long endTime = System.nanoTime();
        long duration = endTime - starTime;
        System.out.println("String to int - Stream");
        result(integerArray, stringArray, duration);
    }

    public static String[] intToString(int[] integerArray){
        long startTime = System.nanoTime();
        String[] stringArray = Arrays.stream(integerArray).mapToObj(String::valueOf).toArray(String[]::new);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Int to String - Stream");
        result(integerArray, stringArray, duration);
        return stringArray;
    }

    public static void forStringToInt(String[] stringArray){
        long startTime = System.nanoTime();
        int[] integerArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            integerArray[i] = Integer.parseInt(stringArray[i]);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Int to String - for");
        result(integerArray, stringArray, duration);
    }

    public static void arrayComparator(int[] array1, String[] array2){
        for (int i = 0; i < array1.length; i++) {
            if (!String.valueOf(array1[i]).equals(array2[i])) {
                System.out.println("Array diferente!");
            }
        }
        System.out.println("Array idêntico!");
    }

    public static void result(int[] integerArray, String[] stringArray, long duration){
        arrayComparator(integerArray, stringArray);
        System.out.println("Tempo decorrido: " + duration/1000000 + "ms");
        System.out.println();
    }
}
