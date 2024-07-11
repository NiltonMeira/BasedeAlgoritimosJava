import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter a number to go from there to 100:");
        num = sc.nextInt();

        count(num);
    }

    public static void count(int x) {
        if( x <= 100) {
            System.out.println(x);
            count(x + 1);
        }
    }
}
