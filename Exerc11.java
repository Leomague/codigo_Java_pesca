package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro : ");
        int n1 = enter.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = enter.nextInt();
        System.out.print("Digite um número real: ");
        double nr = enter.nextDouble();
        System.out.println("A = O produto do dobro do primeiro com metade do segundo ---- " +(n1*2)*(n2/2));
        System.out.println("B = A soma do triplo do primeiro com o terceiro ---- " +((n1*3) + nr));
        System.out.println("C = O terceiro elevado ao cubo ---- " +(nr*nr*nr));
    }
}
