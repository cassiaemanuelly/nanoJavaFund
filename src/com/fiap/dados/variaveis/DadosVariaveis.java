package com.fiap.dados.variaveis;

public class DadosVariaveis {

    public static void main(String[] args) {

//        O java é case sensitive, ou seja, faz diferenciação entre maiúsculos e minúsculas;
//
//        TIPOS DE DADOS
//        Inteiros: byte, short, int, long;
//        Pontos fluantes: float, double;
//        Caractere: char;
//        Array de caracteres: Classe String
//        boolean: true, false;

        //TIPOS DE DADOS E VARIÁVEIS

        String nome = "Cassia";
        int idade = 21;
        double preco = 10.0;
        String sexo = "F";
        boolean filhos = false;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Valor na conta: " + preco);
        System.out.println("Sexo: " + sexo);
        System.out.println("Tem filhos?: " + filhos);


        //CONVERSÃO DE TIPO DE DADOS
        int x = 10;
        double d = x;
        long l = x;
        float f = x;
        short s = 20;
        x = s;

        //Cast - forçar uma conversão (com risco de perda de dados)
        double valorDouble = 9.99;
        int valorInteiro = (int)valorDouble;
        System.out.println(valorInteiro);



    }
}

