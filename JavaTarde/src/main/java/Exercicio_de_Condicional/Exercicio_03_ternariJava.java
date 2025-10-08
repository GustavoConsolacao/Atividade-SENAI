package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_03_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a idade?: ");
        int idade3 = sc.nextInt();
        if (idade3 >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
    }
}
