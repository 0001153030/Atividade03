package src.vectors;
import java.util.Scanner;

public class vector10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vec1 = new int[5];
        int[] vec2 = new int[5];
        int[] vecRes = new int[10];

        System.out.println("Digite 5 números para o primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vec1[i] = sc.nextInt();
        }

        System.out.println("\nDigite 5 números para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vec2[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vecRes[i] = vec1[i];
        }

        for (int i = 0; i < 5; i++) {
            vecRes[i + 5] = vec2[i];
        }

        System.out.println("\n========================================");
        System.out.println("Primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vec1[i] + " ");
        }

        System.out.println("\n\nSegundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vec2[i] + " ");
        }

        System.out.println("\n\nVetor resultante (concatenação):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vecRes[i] + " ");
        }

        System.out.println("\n========================================");

        sc.close();
    }
}