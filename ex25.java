import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        float peso, respmais15, respmenos20;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual seu peso:");
        peso = sc.nextFloat();

        respmais15 = peso * 0.15f;
        respmais15 = respmais15 + peso;

        respmenos20 = peso * 0.20f;
        respmenos20 = peso - respmenos20;

        System.out.printf("Seu peso mais 15 por cento: " + respmais15 + "kilos." + "Seu peso menos 20 por cento:" + respmenos20 + "kilos.");
        sc.close();
    }
}