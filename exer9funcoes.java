import java.util.Scanner;

public class exer9funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, res = 0;
        
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        
        res = sum(num1, num2);
        System.out.println("The result of sum is" + res);
    }

    public static int sum(int num1, int num2){
        int valor;
        
        valor = num1 + num2;
        
        return valor;
    }
}
