package com.fiap.operadores.atribuicao;

import java.util.Scanner;

public class OperadoresAtribuicaoEx2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = entrada.nextDouble();

        preco *= 0.8; // Aplica o desconto de 20%

        System.out.printf("PREÇO COM DESCONTO: R$ %.2f%n", preco);

        entrada.close();
    }
}
