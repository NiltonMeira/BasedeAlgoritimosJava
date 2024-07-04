import java.util.Scanner;

public class v1_ex9 {
    public static void main(String[] args) {

        Integer code, age;
        float height, weight;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o codigo:");
        code = scanner.nextInt();
        System.out.println("Qual o idade:");
        age = scanner.nextInt();
        System.out.println("Qual o altura:");
        height = scanner.nextInt();
        System.out.println("Qual o peso:");
        weight = scanner.nextInt();
        System.out.println("\n");

        System.out.printf("O CODIGO:%d \nA IDADE:%d \nA ALTURA:%.2f \nO PESO:%.2f \n", code, age, height, weight);
        scanner.close();

    }
}
