import java.util.Scanner;

public class listalaco2 {
    public static void main(String[] args) {
        Float salary;
        Float total = 0f;
        Float average;

        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Salary:");
            salary = scanner.nextFloat();
            total = total + salary;
        }
        average = total/5;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        scanner.close();

    }
}
