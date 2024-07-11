public class Ex4 {
    public static void main(String[] args) {
        int[][] mat1 = new int[4][4];
	    int l,c;
	    int valor = 1;
	    int soma = 0;
	
	for(l = 0; l < 4; l++){
		for(c = 0; c < 4; c++){
		    mat1[l][c] = valor;
		    valor = valor * 2;

		    soma = soma + mat1[l][c];
		}
	}
	
	for(l = 0; l < 4; l++){
		for(c = 0; c < 4; c++){
			System.out.println(mat1[l][c]);
		}
	}
	
	System.out.println("A soma da matriz" + soma);
    }
}
