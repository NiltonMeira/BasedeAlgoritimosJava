import java.util.Scanner;

public class v1_ex10 {
    public static void main(String[] args) {
        int code, age;
	    float height, weight;
        Scanner sc = new Scanner(System.in);
	
        System.out.printf("Qual o codigo:");
        code = sc.nextInt();
        System.out.printf("Qual o idade:");
        age = sc.nextInt();
        System.out.printf("Qual o altura:");
        height = sc.nextFloat();
        System.out.printf("Qual o peso:");
        weight = sc.nextFloat();
        System.out.printf("\n");
        
        System.out.printf("O competidor %d , tem %d anos, pesa %.2f Kg e tem %.2f de altura. \n", code, age, weight,height);
        sc.close();
    }

}
