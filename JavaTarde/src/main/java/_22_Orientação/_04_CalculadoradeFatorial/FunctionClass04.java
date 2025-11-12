package _22_Orientação._04_CalculadoradeFatorial;

public class FunctionClass04 {
    public int x;
    int a = x;
    long fat = 1;
    public String aux;
    public String aux () {
        while (x > 1) {
        fat *= x;
        x--;
    }
        aux = ("Fatorial de " + a + ": " + fat);
        return aux;
    }
}
