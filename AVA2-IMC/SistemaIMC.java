
import java.util.Scanner;

public class SistemaIMC {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();

            // Criação do objeto Pessoa
            Pessoa pessoa = new Pessoa(nome, peso, altura);

            // Exibição do resultado
            System.out.println(pessoa);
        }
    }
}
