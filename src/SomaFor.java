import java.util.Scanner;

public class SomaFor {

	public static void main(String[] args) {
		/*Faça um programa que realiza a leitura de 10 números e no final exiba a soma dos
		 * números lidos */

		int soma = 0;
		
		for (int i=1 /*inicializacao*/; i <= 10 /*condicao repeticao*/; i++ /*incremento*/) {
			Scanner sc = new Scanner (System.in);
			System.out.print("Informe número: ");
			int numero = sc.nextInt();
			
			soma += numero;
		}
		System.out.print("A soma é: " + soma);
	}

}
