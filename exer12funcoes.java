import java.util.Scanner;

public class exer12funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, res;
	
		System.out.println("Enter a number: ");
		num = sc.nextInt();
	
		res = pow(num);
	
		System.out.println("The pow is " + res);
    }

    public static int pow (int x){
        return x * x;
    }
}
