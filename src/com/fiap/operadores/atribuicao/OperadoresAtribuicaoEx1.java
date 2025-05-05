package com.fiap.operadores.atribuicao;

public class OperadoresAtribuicaoEx1 {
    public static void main(String[] args) {
//        Exercício 1 — Controle de Pontos de Um Jogador
//        Objetivo: aplicar += e -=
//        Descrição:
//        Crie um programa que simule a pontuação de um jogador.
//        O jogador começa com 0 pontos.
//        Ganha 10 pontos por tarefa concluída (duas vezes).
//        Depois, perde 5 pontos por uma penalidade.
//        Use operadores de atribuição para atualizar a pontuação.

        int pontos = 0;

        pontos += 10;
        System.out.println("Você ganhou 10 pontos, por sua tarefa concluída!");
        System.out.println("TOTAL: "+pontos);

        pontos += 10;
        System.out.println("");
        System.out.println("Você ganhou 10 pontos, por sua tarefa concluída!");
        System.out.println("TOTAL: "+pontos);

        pontos -= 5;
        System.out.println("");
        System.out.println("Você perdeu 5 pontos, por levar uma penalidade!");
        System.out.println("TOTAL: "+pontos);



    }
}
