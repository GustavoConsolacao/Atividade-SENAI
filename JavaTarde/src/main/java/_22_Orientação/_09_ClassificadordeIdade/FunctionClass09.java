package _22_Orientação._09_ClassificadordeIdade;

public class FunctionClass09 {
    public int I;
    public String aux;
    public String aux () {
        if (I <= 12) aux = ("Infantil");
        else if (I <= 17) aux = ("Adolescente");
        else if (I <= 59) aux = ("Adulto");
        else aux = ("Idoso");
        return aux;
    }
}
