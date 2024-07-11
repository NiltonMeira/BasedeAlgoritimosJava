import java.util.Scanner;

public class internetifcomfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = 0, mens = 0;
        float i, height, bigger = 0, smaller = 0, womans = 0.00f, avg_woman = 0.00f, height_womans = 0.00f;

        for (i = 1; i <= 2; i++) {
            System.out.println("Enter the gender\nUse 0 - Female\n 1 - Male:");
            sx = sc.nextInt();
    
            System.out.println("Enter the height:");
            height = sc.nextFloat();
    
            if (i == 1) {
                bigger = height;
                smaller = height;
            }

            if (height > bigger) 
                bigger = height;

            if (height < smaller) 
                smaller = height;

            if (sx == 0) {
                height_womans += height;
                womans++;
            } else
                mens++;
        }

        if(womans > 0) {
            avg_woman = height_womans / womans;
            System.out.println("Womans Average: " + avg_woman);
        } else
            System.out.println("No women entered to get an average!");
        
        System.out.println("Quantity Mens: " + mens);
        System.out.println("Shortest Height" + smaller + "Greatest Height" + bigger);
    }
}
