package com.individual.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sort {

    public static void swap(int[] values, int i, int j){
        int alt = values[i];
        values[i] = values[j];
        values[j] = alt;
    }

    public static void selectionSort(int[] values){
        for(int i=0; i<values.length; i++){
            int min = i;
            for(int j=i+1; j<values.length; j++){
                if (values[j] < values[min]) {
                    min = j;
                }
            }
            if (values[min] != values[i]) {
                swap(values, i, min);
            }
        }
    }

    public static void insertionSort(int[] values){
        for(int i=0; i<values.length; i++){
            int pointer = i;
            if (i != 0) {
                while (pointer > 0 && values[pointer - 1] > values[pointer] ) {
                    swap(values, pointer, pointer-1);
                    pointer -= 1;
                }
            }
        }
    }

    public static void javaSort(int[] values){
        List<Integer> valuesList = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i++) {
            valuesList.add(values[i]);
        }
        valuesList.sort(Comparator.naturalOrder());
        int i = 0;
        for (Integer integer : valuesList) {
            values[i] = integer;
            i++;
        }
    }

    public static void mergeSort(int[] values) {
        int mid = values.length/2;

        if (values.length < 2) {
            return;
        }

        int[] left = Arrays.stream(values,0,mid).toArray();
        int[] right = Arrays.stream(values,mid,values.length).toArray();
        mergeSort(left);
        mergeSort(right);
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

}
