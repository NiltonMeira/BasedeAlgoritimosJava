import java.util.Scanner;

public class whilepratica5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people_num = 0;
	    String sx;
	    float height, resp;
	
	    System.out.println("How tall is the person?");
	    height = sc.nextInt();
	
	    while(height > 0){
	        System.out.println("What is the person's sex? (M)Men/(F)Women");
	        sx = sc.nextLine();
	
		    people_num += 1;
		
		    if(sx.equals("M"))
			    resp =(72.7f * height) - 58f;
		    else
			    resp =(62.1f * height) -44.7f;
		
	        System.out.println("Your ideal weight " + resp + " kilos");

	        System.out.println("How tall is the person?");
	        height = sc.nextInt();
	    }
	    System.out.println(people_num + "participants.");
    } 
}
