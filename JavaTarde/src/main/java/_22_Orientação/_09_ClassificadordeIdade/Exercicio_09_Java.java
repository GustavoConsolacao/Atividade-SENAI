package _22_Orientação._09_ClassificadordeIdade;

import _22_Orientação._01_CalculadoraSimples.FunctionClass01;

import java.util.Scanner;

public class Exercicio_09_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        FunctionClass09 func = new FunctionClass09();

        func.I = sc.nextInt();
        System.out.println(func.aux());
    }
}
