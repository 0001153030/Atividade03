package src.vectors;
import java.util.Scanner;

public class vector8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int[] dbl = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            dbl[i] = nums[i] * 2;
        }

        System.out.println("\n========================================");
        System.out.println("  Vetor Original  |  Vetor Dobro");
        System.out.println("========================================");

        for (int i = 0; i < 5; i++) {
            System.out.printf("  %8d        |  %8d\n", nums[i], dbl[i]);
        }

        System.out.println("========================================");

        sc.close();
    }
}