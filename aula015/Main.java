import Animais.Cachorro;
import Animais.Gato;

public class Main {

    public static void main(String[] args) {

        // Esta aula é sobre modelagem de dados
        
        Cachorro cachorro1 = new Cachorro("CL", "Laaranja", 55, 30.0, 43, 4, "Contente");
        Cachorro cachorro2 = new Cachorro("CL", "Laaranja", 55, 30.0, 43, 4, "Contente");

        // como saber qual objeto é qual aqui ja que ambos possuem os mesmos valores nos atributos?
        // ao usar a funcao tostring conseguimos ver o endereco na memoria que aquele objeto esta

        // vemos que sao objetos diferentes
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

        cachorro1 = cachorro2;

        // vemos que sao o mesmo objeto
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());


        // neste exemplo eu redefini o metodo toString
        Gato gato1 = new Gato("Mingau", "Ciames", 7);
        Gato gato2 = new Gato("Tobias", "Mestico", 3);
        System.out.println(gato1.toString());
        System.out.println(gato2 .toString());


        // outra coisa que podemos fazer é usar uma variavel estatica, ela sera para a classe como um todo, e nao para cada objeto
        Cachorro cachorro3 = new Cachorro();
        System.out.println(cachorro1.getQuantity);

    }
}