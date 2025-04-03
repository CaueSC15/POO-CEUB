public class IMCAnalyzer {
    
    public String analisar(double imc) {
        if (imc < 18.5) {
            return "Baixo peso. É recomendado procurar um médico para avaliação criteriosa do resultado.";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso adequado. Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros.";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso. O sobrepeso está associado ao risco de doenças como diabetes e hipertensão.";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau I. Busque orientação médica e nutricional para entender melhor o seu caso.";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau II. Não adie a busca por orientação médica e nutricional.";
        } else {
            return "Obesidade grau III. Busque orientação médica urgente.";
        }
    }
}
