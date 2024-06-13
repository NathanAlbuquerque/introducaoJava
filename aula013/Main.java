import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        // Agora usando os setters para definir valor aos atributos do nosso objeto
        cachorro1.setNome("Puppy");
        cachorro1.setCor("Vermelho");
        cachorro1.setAltura(37);
        cachorro1.setPeso(57.7);
        cachorro1.setTamanhoDoRabo(4);

        cachorro1.comer();
        cachorro1.latir();
        System.out.println("O cachorro me trouxe uma " + cachorro1.pegarBolinha());

        System.out.println("O cachorro está " + cachorro1.interagir("Carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("Vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("Nada"));

    }
}