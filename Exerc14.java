package com.loiane.cursojava.aula13;

import java.util.Scanner;
//Um sistema criado para equilibrar a pesca que funciona assim:
//peso de peixes menor que 50 kg será liberado.
//caso acima de 50kg, aplicar multa de 4,00 R$ para cada quilograma a mais.
public class Exerc14 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite o peso: ");
        double p = enter.nextDouble();
        double m = (p - 50) * 4 ;
        if (p > 50) {
            System.out.println("EXCESSO DE PEIXE!");
            System.out.print("MULTA R$ 4,00 POR QUILO ........ " + m + " R$");
         } else {
                System.out.print(" SEM EXCESSO DE PESO ");
        }

    }
}
