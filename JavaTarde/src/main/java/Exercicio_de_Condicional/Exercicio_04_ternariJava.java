package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_04_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a temperatura em celsius?: ");
        double temperatura = sc.nextDouble();
        if (temperatura < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Quente");
        }
    }
}
