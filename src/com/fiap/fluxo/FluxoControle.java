package com.fiap.fluxo;

public class FluxoControle {
    public static void main(String[] args) {

        int idade = 25;

        if (idade > 18 && idade <= 70) {
            System.out.println("Você é maior de idade!");
        } else if (idade >= 70) {
            System.out.println("Você faz parte do grupo da terceira idade");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
}
