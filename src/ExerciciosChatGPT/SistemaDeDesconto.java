package ExerciciosChatGPT;

import java.util.Scanner;

public class SistemaDeDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total purchase amount");
        double totalPurchase = sc.nextDouble();
        double discount = 0.0;
        double finalPurchase;

        if (totalPurchase < 100) {
            System.out.println("No discount!");
        } else if (totalPurchase >= 500) {
            discount = (totalPurchase * 20) / 100;
        } else if (totalPurchase >= 300) {
            discount = (totalPurchase * 15) / 100;
        } else if (totalPurchase > 100) {
            discount = (totalPurchase * 10) / 100;
        }
        finalPurchase = totalPurchase - discount;
        System.out.println("The discount applied is  R$: " + discount);
        System.out.println("final amount R$: " + finalPurchase);
        sc.close();

    }
}

