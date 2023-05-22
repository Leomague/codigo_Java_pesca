package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite a primeria nota: ");
        int n1 = enter.nextInt();
        System.out.print("Digite a segunda nota: ");
        int n2 = enter.nextInt();
        System.out.print("Digite a terceira nota: ");
        int n3 = enter.nextInt();
        System.out.print("Digite a quarta nota: ");
        int n4 = enter.nextInt();
        int m = (n1 + n2 + n3 + n4)/4;
        System.out.print("Média final é: " +m);
    }
}
