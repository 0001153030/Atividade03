package src.vectors;
import java.util.Scanner;

public class vector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + num[i]);
        }
        sc.close();
    }
}