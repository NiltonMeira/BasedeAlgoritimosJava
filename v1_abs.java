import java.util.Scanner;

public class v1_abs {
    public static void main(String[] args) {
        int x,y,resp;
        Scanner sc = new Scanner(System.in);

	System.out.printf(" Qual o primeiro numero \n");
	x = sc.nextInt();
	System.out.printf(" Qual o segundo numero \n");
	y = sc.nextInt();
	resp = x-y;
	System.out.printf("A diferença entre %d e %d é: %d\n",x,y,resp);
    sc.close();
    }
}
