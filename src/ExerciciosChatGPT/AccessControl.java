package ExerciciosChatGPT;

import java.util.Scanner;

public class AccessControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Do you have a badge? [yes/no]");
        String answer = sc.next();
        boolean hasBadge;
        hasBadge = answer.equalsIgnoreCase("yes");
        if (hasBadge && age >= 18) {
            System.out.println("Access Allowed!");
        } else {
            System.out.println("Access Denied!");
        }
        sc.close();
    }
}
