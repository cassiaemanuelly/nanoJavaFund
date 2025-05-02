package com.fiap.operadores.aritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticosEx2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double preco;
        double venda;
        int qtd;
        double lucro;
        double lucroTot;

        System.out.print("Digite o preço de compra do produto: ");
        preco = entrada.nextDouble();

        System.out.print("Digite o preço de venda do produto: ");
        venda = entrada.nextDouble();

        System.out.print("Digite a quantidade vendida: ");
        qtd = entrada.nextInt();

        lucro = venda - preco;
        lucroTot = lucro * qtd;

        System.out.println("\n--- RELATÓRIO DE VENDAS ---");
        System.out.printf("Lucro por unidade: R$ %.2f\n", lucro);
        System.out.printf("Lucro total: R$ %.2f\n", lucroTot);

        entrada.close();
    }
}
