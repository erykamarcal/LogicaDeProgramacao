package LogicaNelioAlves;

import java.util.Scanner;

public class taboada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = sc.nextInt();
        int result;

        if (number < 1 || number > 1000){
            System.out.println("Invalid! Enter a number between 1 and 1000");
        } else{
        for (int i = 1; i <= 10; i++) {
                result = i * number;
                System.out.println(number + " * " + i + " = " + result);
            }
        }
  sc.close();
    }
}
