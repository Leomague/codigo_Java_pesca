package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        String  numero;
        Scanner enter = new Scanner(System.in);
        System.out.print ("Digite um numero: ");
        numero = enter.nextLine();
        System.out.print("O número informado foi " +numero);
    }
}
