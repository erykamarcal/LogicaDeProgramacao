package LogicaNelioAlves;

import java.util.Scanner;

public class BaskaraCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value A: ");
        double A = sc.nextDouble();
        System.out.println("Enter the value B: ");
        double B = sc.nextDouble();
        System.out.println("Enter the value C: ");
        double C = sc.nextDouble();
        double delta = B * B - 4.0 * A * C;

        if ((delta < 0.0) || (A == 0.0)){
            System.out.println("There are no real roots. ");
        } else {
            double r1 = (-B + Math.sqrt(delta)) / (2.0 * A);
            double r2 = (-B - Math.sqrt(delta)) / (2.0 * A);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("r2 = %.5f%n", r2);
        }








        sc.close();
    }
}
