package ExerciciosChatGPT;

import java.util.Scanner;

public class GreaterOrLessThan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first student's grade: ");
        double firstGrade = sc.nextDouble();
        System.out.println("Enter the second student's grade: ");
        double secondGrade = sc.nextDouble();

        if (firstGrade == secondGrade){
            System.out.println("They got the same grade!");
        } else if (firstGrade > secondGrade) {
            System.out.println("Student one has the highest grade!");
        } else {
            System.out.println("Student two has the highest grade!");
        }
        sc.close();
    }
}
