package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int a = enter.nextInt();
        int ar = a*a;
        System.out.println("Área do quadrado é: " +ar);
        System.out.print("O dobro dessa área é : " +ar*2);
    }
}
