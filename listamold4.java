import java.util.Scanner;

public class listamold4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float height = 0, width = 0,resp = 0;
	
	    System.out.println("ENTER THE SIDE MEASUREMENT OF THE LAND::");
	    height = sc.nextInt();
	
	    System.out.println("INFORM THE BASE OF THE LAND:");
	    width = sc.nextInt();

	    resp = 	calc(height, width);
	
	    System.out.println("Area = " + resp);

    }

    public static float calc(float height, float width){
        return height * width;
    }
}
