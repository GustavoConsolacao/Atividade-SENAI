package _18_Modulação;

import java.io.Console;
import java.util.Scanner;

public class Exercicio_06_Java {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Numero de notas do aluno: ");
            int n = sc.nextInt();

            double soma = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                double nota = sc.nextDouble();
                soma += nota;
            }

            double media = soma / n;
            System.out.printf("Média: %.2f - ", media);

            if (media >= 7) System.out.println("Aprovado");
            else if (media >= 5) System.out.println("Recuperação");
            else System.out.println("Reprovado");
    }
}