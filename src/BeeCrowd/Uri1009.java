package BeeCrowd;
/*
Faça um programa que leia o nome de um vendedor, o seu salário
fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
 informar o total a receber no final do mês, com duas casas decimais.
 */
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
