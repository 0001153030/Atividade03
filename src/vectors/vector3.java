package src.vectors;
import java.util.Scanner;

public class vector3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] score = new double[5];
        double sum = 0;

        System.out.println("Digite 5 notas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            score[i] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            sum += score[i];
        }

        double median = sum / 5;

        System.out.println("\nNotas digitadas:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nota %d: %.2f\n", (i + 1), score[i]);
        }

        System.out.printf("\nMédia das notas: %.2f\n", median);

        sc.close();
    }
}