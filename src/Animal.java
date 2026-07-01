public class Animal {
    private String nome;
    private String som;

    private int idade;
    private double peso;

    Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public Double getPeso() { return peso; }

    public void emitirSom() {
        System.out.println("Som do " + nome + ": " + som);
    }

    @Override
    public String toString() {
        return nome + " (" + getClass().getSimpleName() + ") - " + idade + " anos, " + peso + "kg";
    }

    public void alimentar(double quantidade) throws Exception {
        if (peso + quantidade > 300) {
            throw new Exception("Animal já está muito pesado!");
        }
        peso += quantidade;
        System.out.println(nome + " foi alimentado! Novo peso: " + peso + "kg");
    }
}
