package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_08_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a idade?: ");
        int idade8 = sc.nextInt();
        if (idade8 <= 12) {
            System.out.println("Infantil");
        } else if (idade8 <= 18) {
            System.out.println("Juvenil");
        } else {
            System.out.println("Adulto");
        }
    }
}
