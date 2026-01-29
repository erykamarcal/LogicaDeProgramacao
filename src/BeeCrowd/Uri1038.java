package BeeCrowd;

import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidade;
        double valor = 0.0;
        double total;
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        switch (codigo){
            case 1: valor = 4.00; break;
            case 2: valor = 4.50; break;
            case 3: valor = 5.00; break;
            case 4: valor = 2.00; break;
            case 5: valor = 1.50; break;
        }
        total = valor * quantidade;
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
