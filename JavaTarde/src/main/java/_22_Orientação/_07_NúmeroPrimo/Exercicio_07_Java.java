package _22_Orientação._07_NúmeroPrimo;

import java.util.Scanner;

public class Exercicio_07_Java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        FunctionClass07 func = new FunctionClass07();
        func.num = sc.nextInt();
        System.out.println(func.aux());
    }
}
