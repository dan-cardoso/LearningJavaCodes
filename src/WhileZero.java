import java.util.Scanner;

public class WhileZero {

	public static void main(String[] args) {
		/*Fa�a um programa que realiza a leitura de
		 * n�mero at� que o usu�rio digite o 0 "zero".
		 * Dever� ser apresentado a m�dia desses n�meros
		 */
		
		double media = 0.0;
		int totalNumeros = 0;
		int numero = 1;
		int soma = 0;
		
		while (numero != 0) {
			System.out.print("Informe o n�mero: ");
			Scanner sc = new Scanner(System.in);
			numero = sc.nextInt();
			
			if (numero!=0) {
			totalNumeros++;
			soma += numero;
			}
		}
		
		media = (double) soma / totalNumeros;
		System.out.println("A m�dia �: " + media );

	}

}