package Animais;

public class Cachorro {

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private int patas = 4;
    private String humor;

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

    // Os contrutores sao definidos entre os atributos e os metodos

    // Quando eu defino um contrutor, eu automaticamente perco o default do Java, assim na Main onde eu estou construindo o objeto nao poderei mais fazer sem passar parametros
    // Para contornar isto eu posso definir um construtor default tambem, desta forma poderei usar dos dois jeitos

    public Cachorro() {} // Contrutor default definido por mim

    //Este é o meu contrutor personalizado
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, int patas, String humor) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.patas = patas;
        this.humor = humor;
    }

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