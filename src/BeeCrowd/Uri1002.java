package BeeCrowd;

import java.util.Scanner;

/*
A fórmula para calcular a área de uma circunferência
é: area = N . raio^2. Considerando para este problema que N = 3.14159:
 */
public class Uri1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = 3.14159;
        double raio;
        double area;

        raio = sc.nextDouble();
        area = n * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
