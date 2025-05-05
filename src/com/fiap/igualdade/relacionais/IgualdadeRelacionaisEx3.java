package com.fiap.igualdade.relacionais;

import java.util.Scanner;

public class IgualdadeRelacionaisEx3 {
    public static void main(String[] args) {

//        Exercício 3 — Notas e Resultado
//        Objetivo: usar >=, <
//        Descrição:
//        Peça a média final de um aluno.
//        Mostre:
//        Se ele foi aprovado (média ≥ 6)
//        Se está de recuperação (entre 4 e 6)
//        Ou reprovado (média < 4)

        Scanner entrada = new Scanner(System.in);

        double media;

        System.out.println("Digite a sua média final: ");
        media = entrada.nextDouble();

        if (media > 6) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else if (media >= 4 && media <= 6) {
            System.out.println("Atenção! Você está de recuperação.");
        } else {
            System.out.println("Você foi reprovado.");
        }

    }
}
