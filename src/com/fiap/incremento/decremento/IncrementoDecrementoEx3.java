package com.fiap.incremento.decremento;

public class IncrementoDecrementoEx3 {
    public static void main(String[] args) {

//        Exercício 3 — Controle de Vidas em um Jogo
//        Objetivo: usar ++ e -- de forma alternada
//        Descrição:
//        Simule a quantidade de vidas de um jogador. Ele começa com 3 vidas. Em seguida:
//        Perde 1 vida (uso de --)
//        Ganha 1 vida (uso de ++)
//        Perde mais 1 vida
//        Mostre o número de vidas após cada evento.

        int vidas = 3;

        System.out.println("Você tem " + vidas + " vidas atualmente.");

        vidas--;
        System.out.println("Você perdeu 1 vida. Agora você tem " + vidas);

        vidas++;
        System.out.println("Você ganhou 1 vida. Agora você tem " + vidas);

        vidas--;
        System.out.println("Você perdeu 1 vida. Agora você tem " + vidas);

        System.out.println("TOTAL DE VIDAS RESTANTES: " + vidas);

    }
}
