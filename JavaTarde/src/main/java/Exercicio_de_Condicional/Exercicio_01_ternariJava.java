package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_01_ternariJava {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual a idade?: ");
    int idade1 = scanner.nextInt();
    if (idade1 >= 18) {
        System.out.println("Maior de idade");
    } else {
        System.out.println("Menor de idade");
    }
    }
}
