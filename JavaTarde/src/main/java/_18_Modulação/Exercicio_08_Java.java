package _18_Modulação;

import java.util.Scanner;

public class Exercicio_08_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Capital inicial: ");
        double capital = sc.nextDouble();

        System.out.print("Taxa de juros (%): ");
        double taxa = sc.nextDouble();

        System.out.print("Tempo (anos): ");
        int tempo = sc.nextInt();

        double montante = capital;
        int ano = 1;

        while (ano <= tempo) {
            montante += montante * (taxa / 100);
            ano++;
        }

        System.out.printf("Montante final: R$ %.2f", montante);
    }
}
