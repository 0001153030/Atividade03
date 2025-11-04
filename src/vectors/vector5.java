package src.vectors;
import java.util.Scanner;

public class vector5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int countDivByTwo = 0;
        int countNonDivByTwo = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (nums[i] % 2 == 0) {
                countDivByTwo++;
            } else {
                countNonDivByTwo++;
            }
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 10; i++) {
            String tipo = (nums[i] % 2 == 0) ? "par" : "ímpar";
            System.out.println("Posição " + i + ": " + nums[i] + " (" + tipo + ")");
        }

        System.out.println("\nQuantidade de números pares: " + countDivByTwo);
        System.out.println("Quantidade de números ímpares: " + countNonDivByTwo);

        sc.close();
    }
}
