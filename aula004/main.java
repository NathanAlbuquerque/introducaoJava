package br.com.letscode.java;

public class Main {

    public static void main(String[] args) {

        int nota = 40;

        // if (nota >= 80) {
        //     System.out.println("Graducao A");
        // } else if (nota >= 60) {
        //     System.out.println("Graducao B");
        // } else if (nota >= 40) {
        //     System.out.println("Graducao C");
        // } else if (nota >= 20) {
        //     System.out.println("Graducao D");
        // } else {
        //     System.out.println("Nota invalida");
        // }

        String graduacao;

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota >= 60) {
            graduacao = "B";
        } else if (nota >= 40) {
            graduacao = "C";
        } else if (nota >= 20) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        // Pesquisar sobre switch com enum no Java
        switch (graduacao) {
            case: "A":
            case: "B":
                System.out.println("Aluno aprovado");
            case: "C":
            case: "D":
                System.out.println("Aluno reprovado");
            default:
                System.out.println("Graducao invalida ");
        }

    }
}