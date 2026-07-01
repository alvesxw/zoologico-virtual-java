public class Pinguim extends Animal {

    Pinguim(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    String som = "quêe!!";
    @Override
    public void emitirSom() {
        System.out.println(som);
    }

    public void nadar() {
        System.out.println("Irei nadar > swooochhh");
    }
}
