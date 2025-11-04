package src.vectors;
import java.util.Scanner;

public class vector4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int big = nums[0];
        int small = nums[0];

        for (int i = 1; i < 10; i++) {
            if (nums[i] > big) {
                big = nums[i];
            }
            if (nums[i] < small) {
                small = nums[i];
            }
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + nums[i]);
        }

        System.out.println("\nMaior valor: " + big);
        System.out.println("Menor valor: " + small);

        sc.close();
    }
}
