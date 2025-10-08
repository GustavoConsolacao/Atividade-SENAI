package flowgorithmIntellij;

import java.util.Scanner;

public class Exercicio_10_flow {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a temperatura (°C): ");
                double temperatura = scanner.nextDouble();

                if (temperatura < 0) {
                    System.out.println("ALERTA: Risco de CONGELAMENTO");
                } else if (temperatura >= 0 && temperatura <= 40) {
                    System.out.println("Temperatura NORMAL");
                } else if (temperatura > 40) {
                    System.out.println("ALERTA: SUPERAQUECIMENTO");
                }

                scanner.close();
    }
}
