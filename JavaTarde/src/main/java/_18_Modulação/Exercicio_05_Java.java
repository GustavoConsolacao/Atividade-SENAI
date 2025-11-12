package _18_Modulação;

import java.util.Scanner;

public class Exercicio_05_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, digite sua senha, ela deve conter pelo menos 8 caracteres, um ou mais números e pelo menos uma letra maiuscula");
        String senha = sc.next();
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
            System.out.println("Senha valida");
        }
        else {
            System.out.println("Erro, senha invalida");
        }
    }
}

