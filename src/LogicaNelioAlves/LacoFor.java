package LogicaNelioAlves;

import java.util.Scanner;

public class LacoFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumNumbers = 0;
        System.out.println("Enter how many numbers you want to sum: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the " + i + "° number: ");
            int number = scanner.nextInt();
            sumNumbers += number;

        }
        System.out.println("Sum: " + sumNumbers);
        scanner.close();
    }
}
