package _18_Modulação;

import java.util.Scanner;

public class Exercicio_07_Java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean primo = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        System.out.println(num + (primo ? " é primo" : " não é primo"));

    }
}
