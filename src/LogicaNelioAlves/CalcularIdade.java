package LogicaNelioAlves;

import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int somaIdade = 0;
        double averageAge;
        int cont = 0;

        while (age >= 0) {
            somaIdade = (somaIdade + age);
            cont = (cont + 1);
            age = sc.nextInt();
        }
        if (cont > 0) {
            averageAge = (double) somaIdade / cont;
            System.out.printf("%.2f", averageAge);
        } else {
            System.out.println("Impossible to calculate");
        }
    }
}

