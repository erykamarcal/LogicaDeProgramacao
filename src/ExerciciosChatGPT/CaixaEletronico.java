package ExerciciosChatGPT;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoInicial = 1000;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo = R$" + saldoInicial);


            } else if (opcao == 2) {
                System.out.println("Qual valor voce gostaria de sacar? ");
                double sacarValor = sc.nextDouble();

                if (sacarValor <= saldoInicial) {
                    saldoInicial = saldoInicial - sacarValor;
                } else{
                    System.out.println("Saldo Insuficiente!");
                }


            } else if (opcao == 3) {
                System.out.println("Quanto voce gostaria de depositar?");
                double depositar = sc.nextDouble();
                saldoInicial = saldoInicial + depositar;


            } else if (opcao == 4){
                System.out.println("Obrigado por usar o sistema!");

            } else {
            System.out.println("Numero invalido. Tente Novamente.");
            }


        }


        sc.close();
    }
}
