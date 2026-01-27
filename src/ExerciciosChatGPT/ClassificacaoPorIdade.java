package ExerciciosChatGPT;

import java.util.Scanner;

public class ClassificacaoPorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age <= 12) {
            System.out.println("You are a child!");
        } else if (age <= 17) {
            System.out.println("You are a teen!");
        } else if (age <= 59) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are a senior!");
        }
    }
}
