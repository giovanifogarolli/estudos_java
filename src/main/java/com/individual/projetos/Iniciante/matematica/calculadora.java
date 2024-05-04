package com.individual.projetos.Iniciante.matematica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculadora {
    public static void calc() throws IOException {
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
}
