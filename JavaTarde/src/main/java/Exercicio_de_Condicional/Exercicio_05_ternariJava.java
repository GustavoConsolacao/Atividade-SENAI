package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_05_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero5 = sc.nextInt();
        String resultado5 = (numero5 % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(resultado5);
    }
}
