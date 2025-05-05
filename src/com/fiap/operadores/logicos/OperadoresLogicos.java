package com.fiap.operadores.logicos;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int idade = 20;
        boolean voto = idade >= 18 && idade < 70;
        //&& - AND ou E (Ambos termos precisam ser verdadeiros)

        int amarelo = 2, vermelho = 1;
        boolean suspenso = amarelo == 2 || vermelho == 1;
        System.out.println(suspenso);
//        || - OR ou OU (Executa se ambos, ou apenas um dos termos for verdadeiro)

        int x = 9, y = 11;
        boolean teste = x > 10 ^ y >10;
        System.out.println(teste);

        teste = x > 8 ^ y > 15;
        System.out.println(teste);
        // ^ - XOR, OU exclusivo (Quando apenas um é verdadeiro)

        int idade2 = 20;
        boolean maioridade = !(idade>10);
        System.out.println(maioridade);


    }
}
