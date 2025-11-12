package _22_Orientação._02_ConversordeTemperatura;

import _22_Orientação._01_CalculadoraSimples.FunctionClass01;

import java.util.Scanner;

public class Exercicio_02_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, insira uma temperatura");
        FunctionClass02 func = new FunctionClass02();
        func.x = sc.nextInt();
        System.out.println("Agora me diga, quer que eu transforme o valor inserido em Fahrenheit ou em Graus Celsius?");
        func.opcao = sc.next();
        System.out.println(func.opcao());
    }
}
