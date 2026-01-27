package ExerciciosChatGPT;

import java.util.Scanner;

public class SexoAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtMulheres = 0;
        int qtHomens = 0;
        double totalAlturaMulheres = 0;
        double totalAlturaHomens = 0;
        double maiorAltura = 0;
        double menorAltura = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o sexo da " + i + "a pessoa: 1 = Feminino | 2 = Masculino");
            int sexo = sc.nextInt();
            while (sexo != 1 && sexo != 2) {
                System.out.println("Numero inválido, escolha entre 1 e 2: ");
                sexo = sc.nextInt();
            }
            System.out.println("Digite a altura da " + i + "a pessoa: ");
            double altura = sc.nextDouble();

            if (sexo == 1) {
                qtMulheres = qtMulheres + 1;
                totalAlturaMulheres = totalAlturaMulheres + altura;
            } else {
                qtHomens = qtHomens + 1;
                totalAlturaHomens = totalAlturaHomens + altura;
            }
            if (i == 1) {
                menorAltura = altura;
                maiorAltura = altura;
            } else {
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;

                }
            }
        }
        double mediaAlturaHomens = totalAlturaHomens / qtHomens;
        System.out.println("A maior altura do grupo é: " + maiorAltura);
        System.out.println("A media de altura dos homens é: " + mediaAlturaHomens);
        System.out.println("qtd mulhets " + qtMulheres);
        sc.close();
    }
}
