package _22_Orientação._05_ValidadordeSenha;

public class FunctionClass05 {
    public String senha;
    public String senha () {
        String aux;
        boolean Tem_letraM = false;
        boolean Tem_num = false;
        if (senha.length() >= 8) {
            for (char c : senha.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    Tem_letraM = true;
                } else if (Character.isDigit(c)) {
                    Tem_num = true;
                }
            }
        }
        if (Tem_letraM && Tem_num == true) {
            aux = ("Senha valida");
        }
        else {
            aux = ("Erro, senha invalida");
        }
        return aux;
    }
}
