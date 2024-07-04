import java.util.Scanner;

public class v1_if1 {
    public static void main(String[] args) {

        float sal;
        Scanner sc = new Scanner(System.in);

        System.out.printf("QUAL O SALÁRIO:");
        sal = sc.nextFloat();

        if (sal > 5000) {
            System.out.printf("MAIOR QUE R$5.000,00");
        }
        sc.close();
    }
}
