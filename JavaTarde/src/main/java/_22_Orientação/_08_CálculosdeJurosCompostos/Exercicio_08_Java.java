package _22_Orientação._08_CálculosdeJurosCompostos;

import _22_Orientação._01_CalculadoraSimples.FunctionClass01;

import java.util.Scanner;

public class Exercicio_08_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Capital inicial: ");
        FunctionClass08 func = new FunctionClass08();
        func.capital = sc.nextDouble();

        System.out.print("Taxa de juros (%): ");
        func.taxa = sc.nextDouble();

        System.out.print("Tempo (anos): ");
        func.tempo = sc.nextInt();
        System.out.println(func.aux());
    }
}
