package com.fiap.dados.variaveis;

import java.util.Scanner;

public class DadosVariaveisEx1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        double preco;
        int qtd;
        boolean disponivel;

        System.out.print("Digite o nome do produto: ");
        nome = entrada.nextLine();

        System.out.print("Digite o preço do produto: ");
        preco = entrada.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        qtd = entrada.nextInt();

        System.out.print("O produto está disponível? (true/false): ");
        disponivel = entrada.nextBoolean();

        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("NOME: " + nome);
        System.out.printf("PREÇO DO PRODUTO: R$ %.2f\n", preco);
        System.out.println("QUANTIDADE DO PRODUTO: " + qtd);
        System.out.println("DISPONÍVEL: " + (disponivel ? "Sim" : "Não"));

        entrada.close();
    }
}
