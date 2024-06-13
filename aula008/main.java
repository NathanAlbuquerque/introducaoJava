package br.com.letscode.java;

public class Main {

    public static void main(String[] args) {

        // Java é uma linguagem fortemente tipada, entao eu nao posso misturar tipos diferentes de dados dentro de um mesmo array;
        
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String[] letras = { "N", "A", "T", "H", "E" };
        for (int j = 0; i < letras.lenght; i++) {
            System.out.println(letras[i]);
        }

    }
}