package com.individual.projetos.Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Matematica {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Entre com a opção: ");
        System.out.println("1- Calculadora");
        System.out.println("2- Fibonacci");
        System.out.println("3- Fatorial");
        System.out.println("4- Constante de Kaprekar");
        System.out.println("0- Exit");
        System.out.println("Entre com uma opção...");
        int op = Integer.parseInt(br.readLine());
        switch (op) {
            case 0:
                System.out.println("Saindo da aplicação...");
                break;
            case 1:
                calc();
            case 2:
                fibonacci();
                break;
            case 3:
                fatorial();
                break;
            case 4:
                kaprekar(76,1);
                break;
            default:
                break;
        }
        
    }

    public static void calc() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1,n2=0;
        System.out.println("Entre com a operação: ");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Modulo");
        System.out.println("6- Raiz quadratica");
        System.out.println("7- Potencialização");
        int op = Integer.parseInt(br.readLine());

        switch (op) {
            case 1:
                System.out.println("Entre com o primeiro numero: ");
                n1 = Integer.parseInt(br.readLine());
                System.out.println("Entre com o segundo numero: ");
                n2 = Integer.parseInt(br.readLine());
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println("Entre com o primeiro numero: ");
                n1 = Integer.parseInt(br.readLine());
                System.out.println("Entre com o segundo numero: ");
                n2 = Integer.parseInt(br.readLine());
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println("Entre com o primeiro numero: ");
                n1 = Integer.parseInt(br.readLine());
                System.out.println("Entre com o segundo numero: ");
                n2 = Integer.parseInt(br.readLine());
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println("Entre com o primeiro numero: ");
                n1 = Integer.parseInt(br.readLine());
                System.out.println("Entre com o segundo numero: ");
                n2 = Integer.parseInt(br.readLine());
                System.out.println(n1/n2);
                break;
            case 5:
                System.out.println("Entre com o primeiro numero: ");
                n1 = Integer.parseInt(br.readLine());
                System.out.println("Entre com o segundo numero: ");
                n2 = Integer.parseInt(br.readLine());
                System.out.println(n1%n2);
                break;
            case 6:
                System.out.println("Entre com o numero desejado: ");
                n1 = Integer.parseInt(br.readLine());
                System.out.println(Math.sqrt(n1));
                break;
            case 7:
                System.out.println("Entre com o numero desejado: ");
                n1 = Integer.parseInt(br.readLine());
                System.out.println("Entre com a potencia: ");
                n2 = Integer.parseInt(br.readLine());
                System.out.println(Math.pow(n1, n2));
                break;
            default:
                break;
        }
    }

    public static void fibonacci() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entre com a quantidade de laços: ");
        int n = Integer.parseInt(br.readLine());
        int x = 0,y=1,alt = 0;
        System.out.println("0");
        System.out.println("1");
        for (int i = 2; i <= n; i++) {
            alt = y;
            System.out.println(y = y + x);
            x = alt;
        }
        
    }

    public static void fatorial() throws IOException{
        System.out.println("Entre com a quantidade de laços: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial*=i;
        }
        System.out.println(fatorial);
    }

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
