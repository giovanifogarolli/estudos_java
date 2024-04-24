package com.individual.projetos.Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
                kaprekar();
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
            System.out.println(fatorial*=i);
        }
    }

    public static void kaprekar(){

    }
}
