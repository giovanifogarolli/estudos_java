package com.individual.projetos.Iniciante.matematica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Entre com a opção: ");
        System.out.println("1- Calculadora");
        System.out.println("2- Fibonacci");
        System.out.println("3- Fatorial");
        System.out.println("4- Constante de Kaprekar");
        System.out.println("5- Numero que se repete");
        System.out.println("0- Exit");
        System.out.println("Entre com uma opção...");
        int op = Integer.parseInt(br.readLine());
        switch (op) {
            case 0:
                System.out.println("Saindo da aplicação...");
                break;
            case 1:
                calculadora.calc();
            case 2:
                fibonacci.fibonacci();
                break;
            case 3:
                fatorial.fatorial();
                break;
            case 4:
                Kaprekar.kaprekar(7,1);
                break;
            case 5:
                nRepete.repete(new int[]{5, 4, 2, 3, 5, 4, 6, 7, 7, 8, 2, 3, 8});
                break;
            default:
                break;
        }
    }
}
