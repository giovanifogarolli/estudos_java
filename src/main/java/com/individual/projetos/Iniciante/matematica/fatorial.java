package com.individual.projetos.Iniciante.matematica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fatorial {
    public static void fatorial() throws IOException {
        System.out.println("Entre com a quantidade de laços: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial*=i;
        }
        System.out.println(fatorial);
    }
}
