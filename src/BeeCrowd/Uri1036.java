package BeeCrowd;
/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da
equação de Bhaskara. Se não for possível calcular as raízes, mostre
a mensagem correspondente “Impossivel calcular”, caso haja uma
divisão por 0 ou raiz de numero negativo.  imprima o resultado das
raízes com 5 dígitos após o ponto
 */
import java.util.Scanner;

public class Uri1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double delta;
        double R1, R2;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = b*b - 4 * a * c;

            if (a == 0 || delta < 0){
                System.out.println("Impossivel calcular");
        } else {
                R1 = (-b + Math.sqrt(delta)) / (2 * a);
                R2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("R1 = %.5f%n", R1);
                System.out.printf("R2 = %.5f%n", R2);
        }
            sc.close();
    }
}
