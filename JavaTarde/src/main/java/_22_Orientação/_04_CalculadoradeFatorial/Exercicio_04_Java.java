package _22_Orientação._04_CalculadoradeFatorial;

import _22_Orientação._03_ContadordePalavras.FunctionClass03;

import java.util.Scanner;

public class Exercicio_04_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, insira um numero");
        FunctionClass04 func = new FunctionClass04();
        func.x = sc.nextInt();
        System.out.println(func.aux());
    }
}
