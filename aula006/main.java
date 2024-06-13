package br.com.letscode.java;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String nome = "Nathan";

        // ISO 8601
        // este é um padrao de representacao de datas

        LocalDate hoje = LocalDate.now();
        Locale brasil - new Locale("pt", "BR");
        // System.out.println(hoje);
        // System.out.println(hoje.getDayOfWeek());
        // System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime hora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia."
        } if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde."
        } if (agora.getHour() >= 18 && agora.getHour() < 25) {
            saudacao = "Boa noite."
        } else {
            saudacao = "Tudo bem?"
        }

        System.out.printf("Ola, %s. Hoje é %s, %s %n", nome, diaSemana, saudacao.toUpperCase());

    }
}