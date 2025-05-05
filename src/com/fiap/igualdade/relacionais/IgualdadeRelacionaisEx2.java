package com.fiap.igualdade.relacionais;

import java.util.Scanner;

public class IgualdadeRelacionaisEx2 {
    public static void main(String[] args) {
//        Exercício 2 — Comparação de Números
//        Objetivo: usar ==, !=, <, >
//        Descrição:
//        Peça dois números inteiros.
//        Diga se:
//        São iguais ou diferentes
//        Qual é o maior

        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        if (num1 == num2){
            System.out.println("Os números são iguais!");
        }else{
            System.out.println("Os número são diferentes!");
        }

        if (num1>num2){
            System.out.println("O primeiro número é maior que o segundo!");
        }else if (num1<num2) {
            System.out.println("O segundo número é maior que o primeiro!");
        } else {
            System.out.println("Os números são iguais!");
        }

    }
}
