package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite um número :");
        int n1 = enter.nextInt();
        System.out.print("Digite outro número :");
        int n2 = enter.nextInt();
        System.out.print("A soma dos números digitados é :" +(n1 + n2));
    }
}
