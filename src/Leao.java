public class Leao extends Animal {

    Leao(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    String som = "urreeeaauuu";
    @Override
    public void emitirSom() {
        System.out.println(som);
    }

    public void cacar() {
        System.out.println("VOU TE PEGAAAA!");;
    }
}
