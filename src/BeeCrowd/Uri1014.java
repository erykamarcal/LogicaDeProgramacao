package BeeCrowd;
/*
Calcule o consumo médio de um automóvel sendo fornecidos
a distância total percorrida (em Km) e o total de combustível gasto (em litros).
 */
import java.util.Scanner;

public class Uri1014{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanciaPercorrida;
        double combustivelGasto;
        double consumoMedio;

        distanciaPercorrida = sc.nextInt();
        combustivelGasto = sc.nextDouble();
        consumoMedio = distanciaPercorrida / combustivelGasto;
        System.out.printf("%.3f km/l%n", consumoMedio);

        sc.close();
    }
}
