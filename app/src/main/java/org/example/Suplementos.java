package org.example;

import java.util.Scanner;

public class Suplementos {

    public static void main(String[] args) {
        
        int n=0;
        int t=0;
        int menor=0;
        int total=0;

        Scanner input = new Scanner(System.in);

        while (n < 1 || n > 1000) {

            System.out.println("Insira o valor N: ");
            n = input.nextInt();

        }

        for(int i=0; i < n; i++){

            System.out.println("Insira a quantidade de suplementos recebidos/gastos: ");
            t = input.nextInt();

            total += t;

            if(total < 0 || total < menor){

                menor = total;

            }

        }

        total = Math.abs(menor);

        System.out.println("Este é a quantidade inicial recomendada: " + total);

    }

}
