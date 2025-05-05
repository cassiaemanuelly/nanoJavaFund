package com.fiap.operadores.logicos;

import java.util.Scanner;

public class OperadoresLogicosEx1 {
    public static void main(String[] args) {

//        Exercício 1 — Acesso a Sistema
//        Objetivo: Usar && (E lógico)
//        Descrição:
//        Peça ao usuário um nome de usuário e uma senha.
//        Se ambos estiverem corretos (ex: usuário: "admin", senha: "1234"), exiba "Acesso permitido".
//        Caso contrário, exiba "Acesso negado".

        Scanner entrada = new Scanner(System.in);

        String usuario = "admin";
        String senha = "1234";
        String usuario2;
        String senha2;

        System.out.println("Digite o seus usuário: ");
        usuario2 = entrada.nextLine();

        System.out.println("Digite a sua senha: ");
        senha2 = entrada.nextLine();

        if (senha.equals(senha2) && usuario.equals(usuario2)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }


    }
}
