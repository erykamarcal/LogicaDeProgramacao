package ExerciciosChatGPT;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class NotasAaF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        double grade = sc.nextDouble();

        if (grade < 0){
            System.out.println("Invalid input! Try again.");
        } else if (grade <= 59){
            System.out.println("E");
        } else if (grade <= 69 ) {
            System.out.println("D");
        } else if (grade <= 79) {
            System.out.println("C");
        } else if (grade <= 89) {
            System.out.println("B");
        } else if (grade <= 100) {
            System.out.println("A");
        }
    }
}
