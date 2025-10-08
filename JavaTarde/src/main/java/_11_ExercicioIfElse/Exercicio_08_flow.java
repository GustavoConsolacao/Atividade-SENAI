package flowgorithmIntellij;

import java.util.Scanner;

public class Exercicio_08_flow {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Digite a quantidade restante de material (%): ");
                double material = sc.nextDouble();

                if (material < 20) {
                    System.out.println("TROCAR material imediatamente!");
                } else {
                    System.out.println("CONTINUAR impressão - material suficiente");
                }

                sc.close();
    }
}