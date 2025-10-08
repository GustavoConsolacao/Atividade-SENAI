package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_11_ternariJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        String resultado = (numero > 0) ? "Positivo" :
                (numero < 0) ? "Negativo" : "Zero";
        System.out.println(resultado);

        sc.close();
    }
}
