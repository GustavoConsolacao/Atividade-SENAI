package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double x, y;
        y = 50.00;
            System.out.println("insira aqui o seu tempo de consumo em minutos do plano atual");
        x = sc.nextDouble();
        if (x <= 100){
            System.out.printf("o valor total a ser pago sera R$ %.2f%n", y);
        }
        else{
            y += ((x - 100) * 2);
            System.out.printf("o valor total a ser pago sera de R$ %.2f%n", y);
        }
    }
}

