import java.util.Scanner;

public class laco {
    public static void main(String[] args) {
        float sal, total = 0, media;
        int cont;
        Scanner sc = new Scanner(System.in);

        for (cont = 1; cont <= 5; cont++) {
            System.out.printf("Informe o salario do funcionario %d:", cont);
            sal = sc.nextFloat();

            total = total + sal;
        }

        System.out.println("Total: " + total);
        media = total / (cont - 1);
        System.out.println("Media: " + media);
        sc.close();
        
    }
}
