package ExerciciosChatGPT;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String enterPassword = sc.next();
        String correctPassword = "SP2026";
        while (!enterPassword.equals(correctPassword)){
            System.out.println("Wrong Password! Try Again");
            enterPassword = sc.next();
        }
        System.out.println("Access Granted!");
    }
}
