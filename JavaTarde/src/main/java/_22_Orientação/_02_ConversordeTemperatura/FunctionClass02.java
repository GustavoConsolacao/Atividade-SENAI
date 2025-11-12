package _22_Orientação._02_ConversordeTemperatura;

public class FunctionClass02 {
    public int x;
    public String opcao;

    public String opcao() {
        String aux;
        if (opcao.equalsIgnoreCase("Fahrenheit")) {
            aux = ("Ok, valor alterado em Fahrenheit, valor atual:" + (x * 1.8 + 32));
        } else {
            aux = ("Ok, valor alterado em Celsius, valor atual:" + ((x - 32) * 5 / 9));
        }
        return aux;
    }
}
