import java.util.Scanner;

public class v1_ex25 {
    public static void main(String[] args) {
        float peso, respmais15, respmenos20;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual seu peso:");
        peso = sc.nextFloat();

        respmais15 = peso * 0.15f;
        respmais15 = respmais15 + peso;

        respmenos20 = peso * 0.20f;
        respmenos20 = peso - respmenos20;

        System.out.printf("\n");
        System.out.printf("Seu peso mais 15 por cento: %.2f kilos. \nSeu peso menos 20 por cento: %.2f kilos. \n",
                respmais15, respmenos20);
        System.out.printf("\n");
        sc.close();
    }
}
