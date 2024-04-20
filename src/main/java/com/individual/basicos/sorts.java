package com.individual.basicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class sorts {
    static Random rd = new Random();

    public static void selectionSort(){
        int values[] = rd.ints(10000, 0, 1000000).toArray();
        long startTime = System.nanoTime();
        for(int i=0; i<values.length; i++){
            int min = i;
            for(int j=i+1; j<values.length; j++){
                if (values[j] < values[min]) {
                    min = j; 
                }
            }
            if (values[min] != values[i]) {
                int alt = values[i];
                values[i] = values[min];
                values[min] = alt;
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        printResult(values, duration, "Selection");
    }

    public static void insertionSort(){
        int values[] = rd.ints(10000, 0, 1000000).toArray();
        long startTime = System.nanoTime();
        for(int i=0; i<values.length; i++){
            int pointer = i;
            if (i != 0) {
                while (pointer > 0 && values[pointer - 1] > values[pointer] ) {
                    int alt = values[pointer - 1];
                    values[pointer - 1] = values[pointer];
                    values[pointer] = alt;
                    pointer -= 1;
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        printResult(values, duration, "Insertion");
    }

    public static void bubbleSort(){
        int values[] = rd.ints(10000, 0, 1000000).toArray();
        long startTime = System.nanoTime();
        boolean swapped;

        for (int i = 0; i < values.length; i++) {
            swapped = false;
            for (int j = 0; j < values.length -i -1; j++) {
                if (values[j] > values[j+1]) {
                    int alt = values[j];
                    values[j] = values[j+1];
                    values[j+1] = alt;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        printResult(values, duration, "bubble");
    }

    public static void mergeSort(){
        int values[] = rd.ints(10000, 0, 1000000).toArray();
        long startTime = System.nanoTime();
        mergeResolve(values);
        long endTime = System.nanoTime();
        long duration = endTime-startTime;
        printResult(values, duration, "Merge");
    }

    private static void mergeResolve(int[] values) {
        int mid = values.length/2;

        if (values.length < 2) {
            return;
        }

        int[] left = Arrays.stream(values,0,mid).toArray();
        int[] right = Arrays.stream(values,mid,values.length).toArray();
        mergeResolve(left);
        mergeResolve(right);
        merge(left, right, values);
    }

    private static void merge(int[] left, int[] right, int[] mergedArray) {
        int i=0,j=0,k=0;
        while (left.length > i && right.length > j) {
            if (left[i] <= right[j]) {
                mergedArray[k] = left[i];
                i++;
            }else{
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }

        while (left.length > i) {
            mergedArray[k] = left[i];
            i++;
            k++;
        }

        while (right.length > j) {
            mergedArray[k] = right[j];
            j++;
            k++;
        }
    }

    public static void javaSort(){
        int values[] = rd.ints(10000, 0, 1000000).toArray();
        long startTime = System.nanoTime();
        List<Integer> valuesList = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i++) {
            valuesList.add(values[i]);
        }
        valuesList.sort(Comparator.naturalOrder());
        long endTime = System.nanoTime();
        System.out.println();
        for (int i = 0; i < values.length; i++) {
            for (Integer integer : valuesList) {
                values[i] = integer;
            }
        }
        long duration = endTime-startTime;
        printResult(values, duration, "Java");
    }

    public static String isSorted(int[] sortedValue){
        for (int i = 0; i < sortedValue.length; i++) {
            if ((i < sortedValue.length-1) && sortedValue[i] > sortedValue[i+1]) {
                return "Not sorted at "+i + " and " + (i+1);
            }
        }
        return "Sorted!";
    }

    public static void printResult(int[] array, long duration, String name){
        System.out.print(name + " sort: ");
        // for(int i = 0; i<array.length; i++){
        //     System.out.print(array[i] + " ");
        // }
        System.out.println();
        System.out.println("Tempo gasto: " + duration/1000000 +" ms");
        System.out.println(isSorted(array));
        System.out.println();
    }
}

