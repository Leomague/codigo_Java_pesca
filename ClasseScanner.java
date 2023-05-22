package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite seu nome completo:" );
        String nomeCompleto = enter.nextLine();
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = enter.nextLine();
        System.out.print("Seu primeiro nome é: " +primeiroNome);
    }
}
