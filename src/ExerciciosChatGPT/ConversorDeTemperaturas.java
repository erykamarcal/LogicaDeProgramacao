package ExerciciosChatGPT;

public class ConversorDeTemperaturas {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("--CONVERSOR DE TEMPERATURAS--");
        System.out.println("-----------------------------");
        double C = 2.43;
        double K, Re, Ra, F;

        F = (C * 1.8) + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = (C * 1.8) + 32 + 459.67;

        System.out.println(F);
        System.out.println(K);
        System.out.println(Re);
        System.out.println(Ra);
    }
}
