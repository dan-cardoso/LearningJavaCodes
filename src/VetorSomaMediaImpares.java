

import java.util.ArrayList;
import java.util.Scanner;

public class VetorSomaMediaImpares {
	public static void main(String[] args) {
		int soma = 0;
		double media = 0;
		int totalnum = 0;
		
		ArrayList<Integer> impares = new ArrayList<Integer>();
		
		int [] numeros = new int[10]; 

		for(int i=0; i < numeros.length; i++) {
			System.out.print("Informe o número: ");
			Scanner sc = new Scanner(System.in);
			numeros[i] = sc.nextInt();
			soma += numeros[i];
			totalnum++;
			if (numeros[i] % 2 == 0) {
			} else {
				impares.add(numeros[i]);
			} 
		}
		
		media = (double) soma / totalnum;
		
		System.out.println("Os números impares inseridos são " );
		for(int a=0; a < impares.size(); a++) {
		System.out.println(impares.get(a));
		}
		System.out.println("A soma dos números inseridos é " + soma);
		System.out.println("A média dos números inseridos é " + media);

		
	}
}
