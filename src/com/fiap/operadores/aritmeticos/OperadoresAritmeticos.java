package com.fiap.operadores.aritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = 15;

        int result = x + y;
        System.out.println(result);

        result = x - y;
        System.out.println(result);

        result = x * y;
        System.out.println(result);

        result = x / y;
        System.out.println(result);

        result = x % y;
        System.out.println(result);

        result = z - x + y * (x/y);
        System.out.println("");
        System.out.println(result);

    }
}
