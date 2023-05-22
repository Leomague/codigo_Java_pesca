package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite o valor para conversão: ");
        int m = enter.nextInt();
        System.out.print("O valor convertido para centímetros é: " +(m * 100)+"Cm");
    }
}
