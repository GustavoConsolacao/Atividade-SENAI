package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_12_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a idade?: ");
        int idade = sc.nextInt();

        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);

        sc.close();
    }
}
