package com.fiap.incremento.decremento;

public class IncrementoDecrementoEx2 {
    public static void main(String[] args) {
//        Exercício 2 — Contagem Regressiva para o Lançamento
//        Objetivo: aplicar --
//        Descrição:
//        Implemente uma contagem regressiva a partir de 5 até 0 para simular a decolagem de um foguete.
//        Utilize o operador de decremento e exiba a contagem em cada passo.
//        Saída esperada:
//        5...
//        4...
//        3...
//        2...
//        1...
//        Decolar!

        int contagem = 5;

        System.out.println(contagem + "...");

        contagem--;
        System.out.println(contagem + "...");

        contagem--;
        System.out.println(contagem + "...");

        contagem--;
        System.out.println(contagem + "...");

        contagem--;
        System.out.println(contagem + "...");

//        while (contagem > 0) {
//            System.out.println(contagem + "...");
//            contagem--;
//        }

        System.out.println("Decolar!");

    }
}
