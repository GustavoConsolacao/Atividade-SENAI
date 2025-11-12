package _22_Orientação._05_ValidadordeSenha;

import _22_Orientação._02_ConversordeTemperatura.FunctionClass02;

import java.util.Scanner;

public class Exercicio_05_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, digite sua senha, ela deve conter pelo menos 8 caracteres, um ou mais números e pelo menos uma letra maiuscula");
        FunctionClass05 func = new FunctionClass05();
        func.senha = sc.next();
        System.out.println(func.senha());
    }
}
