import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class v1_vetMatricula {
    public static void main(String[] args) {
        List<Long> codes = new ArrayList<Long>();
        Boolean running = true;

        while (running) {
            System.out.println("What is your desire ? / 1 - Add a student / 2 - find a student / 3 - Exit");
            Scanner scanner = new Scanner(System.in);
            var option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter with the student code ");
                    var studentCode = scanner.nextLong();
                    codes.add(studentCode);
                    break;

                case 2:
                    System.out.println("Enter with the student code ");
                    var studentsCode = scanner.nextLong();
                    Boolean exists = false;

                    for (Long i : codes) {
                        if (i == studentsCode)
                            exists = true;
                    }

                    if (exists == true)
                        System.out.println("The student exists");
                    else
                        System.out.println("The student dont exist");
                    break;

                case 3:
                    scanner.close();
                    running = false;
                    break;

                    
            }
        }
        
    }
}
