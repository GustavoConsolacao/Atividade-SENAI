package flowgorithmIntellij;

import java.util.Scanner;

public class Exercicio_09_flow {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Digite o índice de defeito do lote (%): ");
                double indiceDefeito = sc.nextDouble();

                if (indiceDefeito > 10) {
                    System.out.println("ALERTA! Lote com alto índice de defeito");
                } else {
                    System.out.println("Lote APROVADO");
                }

                sc.close();
    }
}
