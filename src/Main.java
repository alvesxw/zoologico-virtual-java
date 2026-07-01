import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> zoologico = new ArrayList<>();
        while (true) {
            System.out.println("c (cadastrar um animal) l (listar todos animais) a (alimentar animal)");
            String opt = sc.next();

            switch (opt) {
                case "c":
                    System.out.println("l (Leão) p (Pinguim)");
                    String especie = sc.next();
                    System.out.println("Digite o nome do animal: ");
                    String nome = sc.next();
                    System.out.println("Digite o peso do animal (em kg): ");
                    double peso = sc.nextDouble();
                    System.out.println("Digite a idade do animal: ");
                    int idade = sc.nextInt();
                    if (especie.equals("l")) {
                        zoologico.add(new Leao(nome, idade, peso));
                        System.out.println("Leão adicionado com sucesso!");
                    } else if (especie.equals("p")) {
                        zoologico.add(new Pinguim(nome, idade, peso));
                    } else {
                        System.out.println("Tipo errado.");
                    }
                    break;
                case "l":
                    for (int i = 0; i < zoologico.size(); i++) {
                        System.out.println((i + 1) + ". " + zoologico.get(i));
                    }

                    break;
                case "a":
                    for (int i = 0; i < zoologico.size(); i++) {
                        System.out.println((i + 1) + ". " + zoologico.get(i));
                    }
                    System.out.println("Digite o número do animal: ");
                    int idx = Integer.parseInt(sc.next()) - 1;
                    System.out.println("Digite a quantidade de comida (kg): ");
                    double quantidade = sc.nextDouble();
                    try {
                        zoologico.get(idx).alimentar(quantidade);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}

