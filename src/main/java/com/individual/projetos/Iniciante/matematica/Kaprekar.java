package com.individual.projetos.Iniciante.matematica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kaprekar {
    public static void kaprekar(int num, int trys) throws IOException {
        if (num < 1000){
            do {
                num = num*10;
            }while(num<1000);
        }
        for (int i = 2; i < 10; i++) {
            if (num == 1111 || num / i == 1111){
                System.out.println("Numero invalido");
                return;
            }
        }
        int[] numSorted = sort(num);

        int result = numSorted[1] - numSorted[0];


        if (result == 6174){
            System.out.println(trys);
            return;
        }else{
            trys+=1;
            kaprekar(result, trys);
        }
    }

    public static int[] sort(int num) {
        String numString = String.valueOf(num);
        String[] stringArray = numString.split("");
        List<Integer> numArray = new ArrayList<Integer>();
        int Asc = 0, Desc = 0;

        for (int i = 0; i < stringArray.length; i++) {
            numArray.add(Integer.parseInt(stringArray[i]));
        }

        numArray.sort(Comparator.naturalOrder());
        int AscArr[] = numArray.stream().mapToInt(Integer::intValue).toArray();
        int j = AscArr.length;
        for (int i = 0; i < AscArr.length; i++) {
            Asc = Asc*10+AscArr[i];
            Desc = Desc*10+AscArr[j-1];
            j--;
        }
        // Versão completa do decrescente:
//        numArray.sort(Comparator.reverseOrder());
//        int DescArr[] = numArray.stream().mapToInt(Integer::intValue).toArray();
//        for (int i = 0; i < DescArr.length; i++) {
//            Desc = Desc*10+DescArr[i];
//        }

        return new int[]{Asc, Desc};
    }
}
