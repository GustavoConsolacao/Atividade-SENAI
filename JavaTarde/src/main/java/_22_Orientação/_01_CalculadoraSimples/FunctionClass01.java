package _22_Orientação._01_CalculadoraSimples;

public class FunctionClass01 {
        public int x;
        public int y;
    public String opcao;

    public String opcao() {
            String aux;
            if (opcao.equalsIgnoreCase("soma")) {
                aux = ("Ok, resultado da " + " desses dois numeros: " + (x + y));
            } else if (opcao.equalsIgnoreCase("subtração")) {
                aux = ("Ok, resultado da " + " desses dois numeros: " + (x - y));
            } else if (opcao.equalsIgnoreCase("multiplicação")) {
                aux = ("Ok, resultado da " + " desses dois numeros: " + (x * y));
            } else if (opcao.equalsIgnoreCase("divisão")) {
                aux = ("Ok, resultado da " + " desses dois numeros: " + (x / y));
            }
            else {
                aux = ("Erro, operação inválida, tente novamente mais tarde");
            }
            return aux;
        }
}


