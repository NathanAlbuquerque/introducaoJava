package br.com.letscode.java;

public class Main {

    public static void main(String[] args) {

        String nome = "Nathan";

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.lenth());

        String outroNome = "nathan";
        System.out.println(nome.equals(outroNome));
        System.out.println(nome.equalsIgnoreCase(outroNome));
        
    }
}