package _22_Orientação._08_CálculosdeJurosCompostos;

public class FunctionClass08 {
    public double capital;
    public double taxa;
    public int tempo;
    public String aux;

    public String aux() {
        double montante = capital;
        int ano = 1;

        while (ano <= tempo) {
            montante += montante * (taxa / 100);
            ano++;
        }

        aux = String.format ("Montante final: R$ %.2f", montante);
        return aux;
    }
}
