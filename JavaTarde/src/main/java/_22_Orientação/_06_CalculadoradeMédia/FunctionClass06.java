package _22_Orientação._06_CalculadoradeMédia;

public class FunctionClass06 {
    public int n;
    public String aux;
    public double nota;

    public String aux() {
        double soma = 0;
        for (int i = 0; i < n; i++) {
            aux = ("Nota " + (i + 1) + ": ");
            soma += nota;
        }

        double media = soma / n;
        aux = String.format("Média: %.2f - ", media);

        if (media >= 7) aux = ("Aprovado");
        else if (media >= 5) aux = ("Recuperação");
        else aux = ("Reprovado");
        return aux;
    }

}

