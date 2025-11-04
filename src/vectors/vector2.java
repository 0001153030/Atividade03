package src.vectors;
import java.util.Scanner;

public class vector2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            sum += num[i];
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + num[i]);
        }

        System.out.println("\nSoma total dos valores: " + sum);
        scanner.close();
    }
}