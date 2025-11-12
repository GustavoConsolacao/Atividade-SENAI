package _22_Orientação._10_ConversordeMoeda;

public class FunctionClass10 {
    public String dados[];
    public String aux;
    public String aux () {
        double vl = Double.parseDouble(dados[0]);
        String og = dados[1].toUpperCase();
        String dst = dados[2].toUpperCase();

        double tx = 0;
        if (og.equals("BRL") && dst.equals("USD")) tx = 0.18;
        else if (og.equals("BRL") && dst.equals("EUR")) tx = 0.16;
        else if (og.equals("USD") && dst.equals("BRL")) tx =5.45;
        else if (og.equals("USD") && dst.equals("EUR")) tx = 0.92;
        else if (og.equals("EUR") && dst.equals("BRL")) tx = 5.92;
        else if (og.equals("EUR") && dst.equals("USD")) tx = 1.09;

        double resultado = vl * tx;
        aux = String.format("%.2f %s = %.2f %s\n", vl, og, resultado, dst);
        return aux;
    }
}
