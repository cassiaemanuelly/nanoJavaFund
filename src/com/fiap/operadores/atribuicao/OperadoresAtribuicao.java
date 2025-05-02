package com.fiap.operadores.atribuicao;

public class OperadoresAtribuicao {
    public static void main(String[] args) {

        int x = 15;
        x = x + 15;
        System.out.println(x);

        //+= (recebe o valor da própria variável mais o novo valor atribuído a ela)
        int y = 15;

        y += 15; // y = y + 15
        System.out.println(y);

        y *= 15; // y = y * 15
        System.out.println(y);

        y -= 15; // y = y - 15
        System.out.println(y);

        y /= 15; // y = y / 15;
        System.out.println(y);

    }
}
