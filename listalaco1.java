import java.util.Scanner;

public class listalaco1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0, count = 0;
        float wage;

        System.out.println("Enter your age");
        age = sc.nextInt();

        System.out.println("Enter your wage");
        wage = sc.nextFloat();

        for (count = 0; count < 11; count++) {
            System.out.println(age + " anos e ganha " + wage + " reais");
        }
    }
}
