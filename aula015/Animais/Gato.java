package Animais;

public class Gato { // Nesta classe eu mostro como redefinir o metodo tostring para diferenciar de forma personalizada os objetos

    // atributos

    private String nome;
    private String raca;
    private double peso;

    public String getNome() {
        return this.nome;
    }
    
    public String getRaca() {
        return this.raca;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // contrutores

    public Gato() {}
    public Gato(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    // metodos

    public void comer() {}

    public void miar() {
        System.out.println("Miau!");
    }

    // Redefinicao do metodo toString
    // aqui estou usando um diferenciador como o nome, mas o ideal é usar variaveis unicas, como um id ou cpf por exemplo
    @Override
    public String toString() {
        return "Gato{nome='" + nome + "'}";
    }

}