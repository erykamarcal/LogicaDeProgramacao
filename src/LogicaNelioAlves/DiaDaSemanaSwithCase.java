package LogicaNelioAlves;

import java.util.Scanner;

public class DiaDaSemanaSwithCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1-7) to see the day of the week");
        int number = sc.nextInt();
        String day;
        switch (number) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid input. Enter a number between 1 and 7";
                break;

        }
        System.out.println("The day of the week is: " + day);
        sc.close();
    }
}
