import java.util.Scanner;

public class v1_ex11 {
    public static void main(String[] args) {
        int mat;
        float value;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual o Matricula:");
        mat = sc.nextInt();
        System.out.printf("Qual o valor da mensalidade:");
        value = sc.nextFloat();

        System.out.printf("O aluno %d paga mensalmente R$ %.2f \n", mat, value);
        sc.close();
    }

}
