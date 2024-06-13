package br.com.letscode.java;

public class Main {

    public static void main(String[] args) {

        saldacao("Nathan");

        int resultado = soma(5, 7);
        System.out.println(resultado);

    }

    public static saldacao(String nome) {

        System.out.println("Olá, " + nome);

    }

    public static soma(int a, int b) {

        return a + b;

    }
}