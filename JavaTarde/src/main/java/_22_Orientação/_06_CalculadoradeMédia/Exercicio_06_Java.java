package _22_Orientação._06_CalculadoradeMédia;

import _22_Orientação._01_CalculadoraSimples.FunctionClass01;

import java.util.Scanner;

public class Exercicio_06_Java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de notas do aluno: ");
        FunctionClass06 func = new FunctionClass06();
        func.n = sc.nextInt();
        func.nota = sc.nextDouble();
        System.out.println(func.aux());
    }
}
