package LogicaNelioAlves;

import java.util.Scanner;

/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número
e o salário do funcionário, com duas casas decimais.
 */
public class Uri1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int hour;
        double perHour;
        double salary;

        number = sc.nextInt();
        hour = sc.nextInt();
        perHour = sc.nextDouble();

        salary = perHour*hour;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
