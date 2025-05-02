package com.fiap.operadores.aritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticosEx1 {
    public static void main(String[] args) {

//        2.1 – Área de um Retângulo
//        Solicite largura e altura de um retângulo e calcule a área e o perímetro:

        Scanner entrada = new Scanner(System.in);

        double largura;
        double altura;
        double area;
        double perimetro;
        System.out.println("");
        System.out.print("Digite a Largura: ");
        largura = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        altura = entrada.nextDouble();

        area = largura * altura;
        perimetro = 2 * (largura + altura);

        System.out.println("");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);


    }
}
