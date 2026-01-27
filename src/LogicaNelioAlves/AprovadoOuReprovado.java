package LogicaNelioAlves;

import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first grade: ");
        float FirstGrade = sc.nextFloat();
        System.out.println("Enter your second grade: ");
        float SecondGrade = sc.nextFloat();
        float finalGrade = ((FirstGrade+SecondGrade)/2);
        System.out.println("Your final grade is: " + finalGrade);
        if (finalGrade >= 6.0){
            System.out.println("YOU PASSED!");
        } else {
            System.out.println("YOU FAILED!");
        }
    }
}
