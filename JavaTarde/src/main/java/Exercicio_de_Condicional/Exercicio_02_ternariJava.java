package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_02_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero2 = sc.nextInt();
        String resultado2 = (numero2 >= 0) ? "Positivo" : "Negativo";
        System.out.println(resultado2);
    }
}
