package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite a altura : ");
        double al = enter.nextDouble();
        double psi = (72.7 * al) - 58;
        System.out.print("Seu peso ideal é: " +psi);

    }
}
