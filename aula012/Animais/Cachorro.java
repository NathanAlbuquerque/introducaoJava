package Animais;

public class Cachorro {

    // Definicao dos atributos da classe

    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public int patas = 4;
    public String humor;

    // Definicao dos metodos da classe

    public void comer() {}

    public void latir() {
        System.out.println("Au au!");
    }

    public String pegarBolinha() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        if (acao.equals("Carinho")) {
            this.humor = "Feliz";
        } else if (acao.equals("Vai dormir!")) {
            this.humor = "Bravo";
        } else {
            this.humor = "Neutro";
        }
        return humor;
    }
    
}