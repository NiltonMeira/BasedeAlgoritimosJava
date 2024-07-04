import java.util.Scanner;

public class v1_loopInfiniro_perigo {
    public static void main(String[] args) {
        int num = 0, cont = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("fala ai um numero cacildis: \n");
            num = sc.nextInt();

            cont++;

            if (num == 0) {
                break;
            }
        }
        System.out.printf("foram informados %d numeros.\n", cont);
        sc.close();
    }

}
