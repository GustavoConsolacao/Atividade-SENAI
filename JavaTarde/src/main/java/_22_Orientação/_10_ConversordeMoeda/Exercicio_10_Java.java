package _22_Orientação._10_ConversordeMoeda;

import _22_Orientação._01_CalculadoraSimples.FunctionClass01;

import java.util.Scanner;

public class Exercicio_10_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite (valor moedaOrigem moedaDestino): ");
        FunctionClass10 func = new FunctionClass10();
        func.dados =sc.nextLine().split("");
        System.out.println(func.aux());
    }
}
