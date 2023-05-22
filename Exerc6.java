package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite o raio do círculo : ");
        double r = enter.nextDouble();
        double a = (3.14 * (r*r));
        System.out.print("Área do círculo é: " +a);
    }
}
