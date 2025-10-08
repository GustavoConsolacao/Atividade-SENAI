package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_14_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        sc.close();
    }
}
