package Animais;

public class Cachorro {

    // atributos

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private int patas = 4;
    private String humor;

    // outra coisa que veremos nesta aula é como criar uma variavel estatica, ela sera usada para verificar a quantidade de cachorros
    static int quantity;

    public String getNome() {
        return this.nome;
    }
    
    public String getCor() {
        return this.cor;
    }

    public int getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public int getTamanhoDoRabo() {
        return this.tamanhoDoRabo;
    }

    public int getPatas() {
        return this.patas;
    }

    // precisa ter escrito static e nao deve usar o this
    public static int getQuantity() {
        return quantity;
    }

    public String getHumor() {
        return this.humor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    // contrutores

    public Cachorro() {}
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, int patas, String humor) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.patas = patas;
        this.humor = humor;
    }

    // metodos

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