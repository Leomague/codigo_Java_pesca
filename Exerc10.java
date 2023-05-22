package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite o valor da temperatura em Celsius: ");
        double tc = enter.nextDouble();
        double tf  = (tc * 9)/5 + 32;
        System.out.print("Valor convertido é :" +tf+ " Farenheit" );

    }
}
