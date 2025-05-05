package com.fiap.igualdade.relacionais;

import java.util.Scanner;

public class IgualdadeRelacionaisEx1 {
    public static void main(String[] args) {
//        Exercício 1 — Verificação de Idade Mínima
//        Objetivo: usar >=
//        Descrição:
//        Peça ao usuário a idade.
//        Verifique se ele tem 18 anos ou mais para liberar o acesso.
//        Exiba uma mensagem apropriada.

        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade>=18){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você é menor de idade!");
        }


    }
}
