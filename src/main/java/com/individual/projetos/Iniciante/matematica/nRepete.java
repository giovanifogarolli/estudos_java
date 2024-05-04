package com.individual.projetos.Iniciante.matematica;

import com.individual.biblioteca.sort;

public class nRepete {
    public static void repete(int[] values){
        sort.javaSort(values);
        boolean[] repete = new boolean[values.length];
        for (int i = 0; i < repete.length; i++) {
            repete[i] = true;
        }
        for (int i = 0; i < values.length; i++) {
            if(i+1 < values.length){
                if (values[i] == values[i + 1] || values[i] == values[i - 1]) {
                    repete[i] = false;
                }
            }else
                if (values[i] == values[i-1]){
                    repete[i] = false;
                }
        }
        for (int i = 0; i < repete.length; i++) {
            if (repete[i] == true){
                System.out.println(values[i]);
            }
        }
    }
}
