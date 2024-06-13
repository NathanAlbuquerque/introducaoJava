package br.com.letscode.java;

public class Main {

    public static void main(String[] args) {

        int[] numeros = { 10, 3, 8, 22, 5 }
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            } if else (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media / numeros.length);

    }
}