package br.com.letscode.java;

public class Main {

    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamoAPraia = fimDeSemana && fazendoSol;
        String mensagem = vamoAPraia ? "É final de semana" : "Nao é final de semana";

        System.out.println(mensagem);
        
    }
}