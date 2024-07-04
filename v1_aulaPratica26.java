import java.util.Scanner;

public class v1_aulaPratica26 {
    public static void main(String[] args) {
        float h1, h2, h3, h4, h5, resp;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe as horas trabalhadas no primeiro dia:");
        h1 = sc.nextFloat();
        System.out.printf("Informe as horas trabalhadas no segundo dia:");

        h2 = sc.nextFloat();
        System.out.printf("Informe as horas trabalhadas no terceiro dia:");

        h3 = sc.nextFloat();
        System.out.printf("Informe as horas trabalhadas no quarto dia:");

        h4 = sc.nextFloat();
        System.out.printf("Informe as horas trabalhadas no quinto dia:");

        h5 = sc.nextFloat();

        resp = (h1 + h2 + h3 + h4 + h5) / 5;

        System.out.printf("\n");
        System.out.printf("A média de horas trabalhadas é de: %.1f horas por dia .\n", resp);
        System.out.printf("\n");
        sc.close();
    }
}
