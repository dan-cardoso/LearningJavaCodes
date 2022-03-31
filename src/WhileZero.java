import java.util.Scanner;

public class WhileZero {

	public static void main(String[] args) {
		/*Faça um programa que realiza a leitura de
		 * número até que o usuário digite o 0 "zero".
		 * Deverá ser apresentado a média desses números
		 */
		
		double media = 0.0;
		int totalNumeros = 0;
		int numero = 1;
		int soma = 0;
		
		while (numero != 0) {
			System.out.print("Informe o número: ");
			Scanner sc = new Scanner(System.in);
			numero = sc.nextInt();
			
			if (numero!=0) {
			totalNumeros++;
			soma += numero;
			}
		}
		
		media = (double) soma / totalNumeros;
		System.out.println("A média é: " + media );

	}

}