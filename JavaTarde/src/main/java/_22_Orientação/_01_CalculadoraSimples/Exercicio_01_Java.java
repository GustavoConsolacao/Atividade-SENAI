package _22_Orientação._01_CalculadoraSimples;

import Exemplos.funcoes.FunctionClass;

import java.util.Scanner;

public class Exercicio_01_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, insira abaixo dois valores por favor");
        FunctionClass01 func = new FunctionClass01();
        func.x = sc.nextInt();
        func.y = sc.nextInt();
        System.out.println("Agora, me diga qual tipo de fórmula quer, temos: soma, subtração, multiplicação e divisão");
        func.opcao = sc.next();
        System.out.println(func.opcao());
    }
}
