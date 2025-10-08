package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_13_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();

        String resultado = (salario > 3000) ? "Salário alto" : "Salário baixo";
        System.out.println(resultado);

        sc.close();
    }
}
