package LogicaNelioAlves;

import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double salary;
        double totalSales;
        double newSalary;

        name = sc.next();
        salary = sc. nextDouble();
        totalSales = sc. nextDouble();

        newSalary = salary + totalSales * (15/100F);

    System.out.printf("TOTAL = R$ %.2f%n",newSalary );


    }


}
