import java.util.Scanner;

public class SomaFor {

	public static void main(String[] args) {
		/*Fa�a um programa que realiza a leitura de 10 n�meros e no final exiba a soma dos
		 * n�meros lidos */

		int soma = 0;
		
		for (int i=1 /*inicializacao*/; i <= 10 /*condicao repeticao*/; i++ /*incremento*/) {
			Scanner sc = new Scanner (System.in);
			System.out.print("Informe n�mero: ");
			int numero = sc.nextInt();
			
			soma += numero;
		}
		System.out.print("A soma �: " + soma);
	}

}
