package ExerciciosChatGPT;

import java.util.Scanner;

public class EnterPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "Java123";
        int tentativas = 1;
        System.out.println("Digite a senha.");
        String enterPassword = sc.next();

        while (!enterPassword.equals(correctPassword) && tentativas <= 3) {
            System.out.println("Tente novamente. Tentativa " + tentativas + " de 3.");
            enterPassword = sc.next();
            tentativas++;
        }
        if (enterPassword.equals(correctPassword)) {
            System.out.println("Access Granted!");
        } else {
            System.out.println("Access Denied!");
        }

    }
}
