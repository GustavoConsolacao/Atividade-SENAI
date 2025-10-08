package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_10_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero10 = sc.nextInt();
        if (numero10 % 3 == 0) {
            System.out.println("Divisível");
        } else {
            System.out.println("Não divisível");
        }

        sc.close();
    }
}
