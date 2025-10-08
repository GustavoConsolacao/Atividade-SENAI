package Exercicio_de_Condicional;

import java.util.Scanner;

public class Exercicio_07_ternariJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();
        double imposto = (salario > 5000) ? salario * 0.2 : salario * 0.1;
        System.out.println("Imposto: R$ " + imposto);
    }
}
