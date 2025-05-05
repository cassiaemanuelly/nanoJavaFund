package com.fiap.incremento.decremento;

public class IncrementoDecremento {
    public static void main(String[] args) {

        int x = 10;

        //x = x + 1;
        x++; // a variável adiciona 1 ao seu valor armazenado
        System.out.println("X = " + x);

        // x = x-1;
        x--; // a variável retira 1 ao seu valor armazenado
        System.out.println("X = " + x);

        int z = 10, w = 5, a = 5;

        z = w++;
        System.out.println("Z = " + z);
        System.out.println("W = " + w);

        z = --a;
        System.out.println("Z = " + z);
        System.out.println("A = " + a);

    }
}
