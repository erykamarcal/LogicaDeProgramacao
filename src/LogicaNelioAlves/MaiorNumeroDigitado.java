package LogicaNelioAlves;

import java.util.Scanner;

public class MaiorNumeroDigitado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numberOne = sc.nextInt();
        System.out.println("Enter the second number: ");
        int numberTwo = sc.nextInt();
        System.out.println("Enter the third number ");
        int numberThree = sc.nextInt();

        if ((numberOne == numberTwo) && (numberThree == numberTwo)) {
            System.out.println("The numbers are equal!");
        } else {
            if (numberOne >= numberTwo && numberOne >= numberThree) {
                System.out.println("The largest number is: " + numberOne);
            } else {
                if (numberTwo > numberOne && numberTwo > numberThree) {
                    System.out.println("The largest number is: " + numberTwo);
                } else {
                    System.out.println("The largest number is: " + numberThree);
                }
            }
            sc.close();
        }
    }
}