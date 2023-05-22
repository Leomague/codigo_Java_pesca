package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Digite o valor ganho por hora: ");
        double vh = enter.nextDouble();
        System.out.print("Digite o total de horas trabalhadas no mês: ");
        double th = enter.nextDouble();
        double tsal = vh * th;
        System.out.print("Total do salário nesse mês é: " +tsal);
    }
}
