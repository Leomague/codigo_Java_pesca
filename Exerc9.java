package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc9 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite o valor da temperatura em Farenheit: ");
        double tf = enter.nextDouble();
        double c = (5 * (tf - 32) / 9);
        System.out.print("A temperatura é : " +c+ " Celsius");

    }
}
