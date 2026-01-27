package BeeCrowd;
/*
Neste problema, deve-se ler o código de uma peça 1,
o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor
unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 */
import java.util.Scanner;

public class Uri1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peca1;
        int qtdPeca1;
        double valorPeca1;

        int peca2;
        int qtdPeca2;
        double valorPeca2;

        double valorSerPago;

        peca1 = sc.nextInt();
        qtdPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();


        peca2 = sc.nextInt();
        qtdPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorSerPago = (valorPeca1 * qtdPeca1) + (valorPeca2 * qtdPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorSerPago);

    }
}