import java.util.Scanner;

public class v1_laco {
    public static void main(String[] args) {
        float sal, total = 0, media;
        int cont;
        Scanner sc = new Scanner(System.in);

        for (cont = 1; cont <= 5; cont++) {
            System.out.printf("Informe o salario do funcionario %d:", cont);
            sal = sc.nextFloat();

            total = total + sal;
        }

        System.out.printf("Total: %.2f \n", total);
        media = total / (cont - 1);
        System.out.printf("Media: %.2f \n", media);
        sc.close();
        
    }

}
