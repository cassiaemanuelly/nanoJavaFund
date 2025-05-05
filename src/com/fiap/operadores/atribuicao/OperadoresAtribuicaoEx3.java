package com.fiap.operadores.atribuicao;

public class OperadoresAtribuicaoEx3 {
    public static void main(String[] args) {

        int estoque = 100;
        int caixas = estoque; // Para manter o valor original

        caixas /= 4; // Quantidade por caixa
        int sobra = estoque % 4; // Unidades que sobram

        System.out.println("Cada caixa recebeu: " + caixas + " unidades");
        System.out.println("Unidades restantes (sobras): " + sobra);
    }
}
