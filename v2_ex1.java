import java.util.Scanner;

public class v2_ex1 {
    public static void main(String[] args) {
        float horas_normais = 0, horas_extras = 0, horasnorm_resul = 0, horasext_resul = 0, resul = 0, poup = 0;
        Scanner sc = new Scanner(System.in);
        final Integer hora = 10;
        final Integer horaextra = 15;

        System.out.printf("Informe o numero de horas normais trabalhadas no ano:\n");

        horas_normais = sc.nextFloat();

        System.out.printf("Informe o numero de horas extras trabalhadas no ano:\n");

        horas_extras = sc.nextFloat();

        horasnorm_resul = horas_normais * hora;
        horasext_resul = horas_extras * horaextra;
        resul = horasnorm_resul + horasext_resul;

        poup = resul * 0.08f;

        System.out.printf("______________________________________________________\n");
        System.out.printf("Valor de horas normais: %.2f reais\n\n", horasnorm_resul);
        System.out.printf("Valor de horas extras: %.2f reais\n\n", horasext_resul);
        System.out.printf("Total de ganho no ano = %.2f reais\n\n", resul);
        System.out.printf("Valor a guardar na poupança = %.2f reais\n\n", poup);
        System.out.printf("______________________________________________________\n");
        sc.close();
    }
}
