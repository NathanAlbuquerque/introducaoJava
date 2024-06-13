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

        cachorro1.comer();
        cachorro1.latir();
        System.out.println("O cachorro me trouxe uma " + cachorro1.pegarBolinha());

        System.out.println("O cachorro está " + cachorro1.interagir("Carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("Vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("Nada"));

    }
}