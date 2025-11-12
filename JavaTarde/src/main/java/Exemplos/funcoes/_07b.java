package Exemplos.funcoes;

import java.util.Scanner;

public class _07b {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner(System.in);
        FunctionClass func = new FunctionClass();
        func.a = sc.nextInt();
        func.b = sc.nextInt();
        func.c = sc.nextInt();
        System.out.println("biggest number: "+func.max());
    }
}