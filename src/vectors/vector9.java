package src.vectors;
import java.util.Scanner;

public class vector9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Digite 10 números inteiros (positivos ou negativos):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("\nTodos os números digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\n\nApenas os números positivos:");
        int countPos = 0;

        for (int i = 0; i < 10; i++) {
            if (nums[i] > 0) {
                System.out.print(nums[i] + " ");
                countPos++;
            }
        }

        if (countPos == 0) {
            System.out.print("Nenhum número positivo foi digitado.");
        } else {
            System.out.println("\n\nTotal de números positivos: " + countPos);
        }

        sc.close();
    }
}