/* Uma operadora cobra R$:50.00 por um plano de telefone que dá direito
a 100 minutos de telefone. Se exceder 100, o valor é de R$2.00 por minuto.
 */
package LogicaNelioAlves;

import java.util.Scanner;

public class OperadoraDeTelefonia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double planPrice = 50.00;
        int includedMinutes = 100;
        double extraMinutePrice = 2.00;
        double totalAmount;

        System.out.println("How many minutes were used? ");
        int usedMinutes = sc.nextInt();

        if (usedMinutes <= 100) {
            totalAmount = planPrice;
        } else {
            totalAmount = ((usedMinutes - includedMinutes) * extraMinutePrice + planPrice);
        }
        System.out.println("total amount to pay R$: " + totalAmount);
    }

}
