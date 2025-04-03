
public class Pessoa {
    private final String nome;
    private final double peso;
    private final double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String analisarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau 1";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3 (obesidade mórbida)";
        }
    }

    @Override
    public String toString() {
        double imc = calcularIMC();
        return "Nome: " + nome + "\nIMC: " + imc + "\nAnálise: " + analisarIMC();
    }
}