package org.example;

import java.util.Scanner;

public class AreaTriangulo {

    double pi = 3.14;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        System.out.println("Insira o valor da altura: ");
        double a = input.nextDouble();

        System.out.println("Insira o valor do comprimento: ");
        double b = input.nextDouble();

        System.out.println("Insira o valor do ângulo: ");
        double c = input.nextDouble();

        double rad = Math.toRadians(c);

        double area = (a * b * Math.sin(rad)) / 2.0;

        System.out.print(area);
        
    }

}
