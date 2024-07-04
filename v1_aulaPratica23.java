import java.util.Scanner;

public class v1_aulaPratica23 {
    public static void main(String[] args) {
        float valor,litro;
        Scanner sc = new Scanner(System.in);
	
	System.out.printf("QUAL VALOR GOSTARIA DE ABASTECER:");
	valor = sc.nextFloat();
	System.out.printf("QUAL O VALOR DO LITRO SELECIONADO:");
	litro = sc.nextFloat();
	
	System.out.printf("VOCÊ IRÁ ABASTECER %.3f litro. \n", valor/litro);
    sc.close();
    }
}
