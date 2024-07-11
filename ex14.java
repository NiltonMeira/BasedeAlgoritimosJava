import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float raio, pi = 3.14f;
		
		System.out.println("Enter the radius of the circle: ");
		raio = sc.nextInt();
		float area = pi * (raio * raio);
		System.out.println("The area of the circle is " + area);
	}
}
