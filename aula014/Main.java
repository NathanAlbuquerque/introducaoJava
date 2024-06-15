import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {

        // Esta aula é sobre construtores
        // Nesta linha abaixo estou usando um contrutor default do Java, mas eu posso fzer o meu proprio para ajudar na hora da contrucao de um novo objeto cachorro eu nao ter que fazer como nas linhas subsequentes usando os setters em varias linhas, uma para cada atributo.

        // Forma verbosa usando o contruct default e setters
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Puppy");
        cachorro1.setCor("Vermelho");
        cachorro1.setAltura(37);
        cachorro1.setPeso(57.7);
        cachorro1.setTamanhoDoRabo(4);

        // Forma otimizada usando contruct personalizado
        Cachorro cachorro2 = new Cachorro("CL", "Laaranja", 55, 30.0, 43, 4, "Contente");

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());
    }
}