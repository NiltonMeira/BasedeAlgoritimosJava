import java.util.Scanner;

public class vetmatricula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet =  new int[5];
        int cont = 0, search = 0;
	
	
	for(cont = 0; cont < 5; cont++) {
		System.out.println("ENTER REGISTRATION NUMBER:");
		vet[cont] = sc.nextInt();
	
	}
	
	System.out.println("Informe a matrícula para consulta:");
	search = sc.nextInt();
	
	for(cont = 0; cont < 5; cont++) {
		if(search == vet[cont]) {
			break;
		}
	}

	if(cont == 5)
		System.out.println("License plate not found");
    else
		System.out.println("License found!");
    }
}
