package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_06_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        double nota = sc.nextDouble();
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}
