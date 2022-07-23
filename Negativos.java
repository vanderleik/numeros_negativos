import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        /**
         * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
         * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de números que você irá digitar: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        System.out.println("Digite os números: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();

        }

        System.out.println("NÚMEROS NEGATIVOS");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0 ) {
            System.out.printf("%d\n", vetor[i]);
            }
        }
        sc.close();
    }
}
