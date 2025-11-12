package _18_Modulação;

import java.util.Scanner;

public class Exercicio_03_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa iniciado, digite uma frase qualquer");
        String texto = sc.nextLine();
        String [] vetor = texto.split(" ");
        System.out.println("Frase analisada, sua frase contém " + vetor.length + " palavras");
    }

}
