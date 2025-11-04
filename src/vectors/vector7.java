package src.vectors;
import java.util.Scanner;

public class vector7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = new String[10];

        System.out.println("Digite o nome de 10 alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            students[i] = sc.nextLine();
        }
        System.out.println("\nAlunos cadastrados:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }

        System.out.print("\nDigite o nome que deseja buscar: ");
        String nameSearch = sc.nextLine();

        boolean found = false;
        int pos = -1;

        for (int i = 0; i < 10; i++) {
            if (students[i].equalsIgnoreCase(nameSearch)) {
                found = true;
                pos = i;
                break;
            }
        }

        if (found) {
            System.out.println("\n✓ O aluno \"" + nameSearch + "\" está na lista!");
            System.out.println("Posição: " + (pos + 1));
        } else {
            System.out.println("\n✗ O aluno \"" + nameSearch + "\" NÃO está na lista.");
        }

        sc.close();
    }
}