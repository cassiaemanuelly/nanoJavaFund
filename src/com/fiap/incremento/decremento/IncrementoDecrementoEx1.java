package com.fiap.incremento.decremento;

public class IncrementoDecrementoEx1 {
    public static void main(String[] args) {

//        Exercício 1 — Contador de Cliques
//        Objetivo:
//        aplicar++
//
//        Descrição:
//        Simule um contador de cliques em um botão.
//        O programa começa com 0 cliques e incrementa o contador 3
//        vezes, simulando que o botão foi pressionado 3 vezes.
//        Ao final,exiba o total de cliques.

        int clique = 0;

        clique++;
        clique++;
        clique++;

        System.out.println("TOTAL DE CLIQUES: " + clique);

    }
}
