package com.individual.projetos.Iniciante.matematica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci {
    public static void fibonacci() throws IOException {
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
}
