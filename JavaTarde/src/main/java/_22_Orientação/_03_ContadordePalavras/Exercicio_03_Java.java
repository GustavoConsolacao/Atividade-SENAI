package _22_Orientação._03_ContadordePalavras;

import _22_Orientação._02_ConversordeTemperatura.FunctionClass02;

import java.util.Scanner;

public class Exercicio_03_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, digite uma frase qualquer");
        FunctionClass03 func = new FunctionClass03();
        func.texto = sc.nextLine();
        System.out.println(func.aux());
    }

}
