package com.fiap.operadores.aritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticosEx3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3;
        double peso1, peso2, peso3;
        double media;

        System.out.println("");
        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        peso1 = entrada.nextDouble();

        System.out.println("");
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        peso2 = entrada.nextDouble();

        System.out.println("");
        System.out.print("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        peso3 = entrada.nextDouble();

        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.printf("MÉDIA PONDERADA: %.2f\n", media);

        entrada.close();
    }
}
