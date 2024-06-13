import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {

        // Criacao de um objeto
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Puppy";
        cachorro1.cor = "Vermelho";
        cachorro1.altura = 37;
        cachorro1.peso = 57.7;
        cachorro1.tamanhoDoRabo = 4;

        System.out.println(cachorro1);

    }
}