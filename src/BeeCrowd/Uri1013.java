package BeeCrowd;
/*
Faça um programa que leia três valores e apresente o
maior dos três valores lidos seguido da mensagem “eh o maior”.
Utilize a fórmula:(a + b + |a - b|) / 2
 */
import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int maiorAB;
        int maior;
        int c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maior + " eh o maior");

    }
}
