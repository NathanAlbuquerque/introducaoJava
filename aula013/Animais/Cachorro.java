package Animais;

public class Cachorro {

    // Nesta aula vamos encapsular esta classe para deixa-la protegida, como se fosse "Colocar uma coleira no cachorro e coloca-lo na casinha protegido"
    // Primeiro com os modificadores vou deixar privado os atributos do cachorro

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private int patas = 4;
    private String humor;

    // E usando os getters para poder conceder acesso aos atributos

    public String getNome() {
        // isto é bom pois antes de retornar o nome tenho a possibiidade de criar alguma validacao talvez, fazer quaisquer regras aqui antes da entrega de fato do attributo
        // e por este get nao é possivel que classes externa mudem o nome do cachorro, apenas recuperem ele, dependendo da regra que eu fizer aqui
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

    // Da mesma forma temos o Setters que servem para alterar valor aos atributos, mas seguindo a mesma logica sobre o getters podemos fazer aqui nos setters

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