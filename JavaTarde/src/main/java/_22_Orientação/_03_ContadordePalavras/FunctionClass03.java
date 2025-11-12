package _22_Orientação._03_ContadordePalavras;

public class FunctionClass03 {
    public String texto;
    public String aux;
    public String aux() {
        String [] vetor = texto.split(" ");
        aux = ("Frase analisada, sua frase contém " + vetor.length + " palavras");
        return aux;
    }
}
