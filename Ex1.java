import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float normal_hour = 0, overtime_hour = 0, normal_hour_result = 0, overtime_hour_result = 0, result = 0, poup = 0;
        float hour_value = 10f, overtime_hour_value = 15f;
        
        System.out.println("Enter the number of normal hours worked in the year:");
        normal_hour = sc.nextInt();

        System.out.println("Informe o numero de horas extras trabalhadas no ano:");
        overtime_hour = sc.nextInt();

        normal_hour_result = normal_hour * hour_value;
        overtime_hour_result = overtime_hour * overtime_hour_value;
        result = normal_hour_result + overtime_hour_result;

        poup = result * 0.08f;

        System.out.println("Normal hourly rate: " + normal_hour_result);
        System.out.println("Overtime hourly rate: " + overtime_hour_result);
        System.out.println("Total gain for the year: " + result);
        System.out.println("Amount to save in savings: " + poup);
    }
}