package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_15_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a idade?: ");
        int idade = sc.nextInt();

        String resultado = (idade >= 16) ? "Pode votar" : "Não pode votar";
        System.out.println(resultado);

        sc.close();
    }
}
