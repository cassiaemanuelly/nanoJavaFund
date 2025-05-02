package com.fiap.dados.variaveis;

import java.util.Scanner;

public class DadosVariaveisEx3 {
    public static void main(String[] args) {

        //    1.3 – Informações do Aluno
//    Armazene os dados:
//    Nome do aluno
//    Idade
//    Média final
//    Está aprovado (boolean, baseado na média)
//    Depois, exiba algo como:
//    João, 17 anos — Média: 7.5 — Aprovado? true

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        int media;
        String situação;

        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.print("Digite sua média anual: ");
        media = entrada.nextInt();

        if (media > 6) {
            situação = "Aprovado";
        } else {
            situação = "Reprovado";
        }

        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
        System.out.println("MÉDIA: " + media);
        System.out.println("SITUAÇÃO: " + situação);

    }

}
