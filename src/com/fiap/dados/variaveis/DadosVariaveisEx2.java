package com.fiap.dados.variaveis;

import java.util.Scanner;

public class DadosVariaveisEx2 {
    public static void main(String[] args) {

//        1.2 – Conversor de Temperatura
//        Crie um programa que armazena uma temperatura em graus Celsius (double) e converte para Fahrenheit usando a fórmula:
//        F = (C × 9/5) + 32

        Scanner entrada = new Scanner(System.in);
        double c;
        double f;

        System.out.print("Digite a temperatura em graus Celsius: ");
        c = entrada.nextDouble();

        f = (c * 9.0 / 5.0) + 32; // faz o cálculo depois de ler a temperatura

        System.out.printf("TEMPERATURA EM FAHRENHEIT: %.2f °F\n", f);

        entrada.close();
    }
}
