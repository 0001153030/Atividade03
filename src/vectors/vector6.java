package src.vectors;
import java.util.Scanner;

public class vector6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];

        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros na ordem digitada:");
        for (int i = 0; i < 8; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\n\nNúmeros na ordem inversa:");
        for (int i = 7; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
