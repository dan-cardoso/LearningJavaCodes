import java.util.Scanner;

public class DoWhileZero {

	public static void main(String[] args) {
		double media = 0.0;
		int totalNumeros = 0;
		int numero = 0;
		int soma = 0;
		
		do {
			System.out.print("Informe o número: ");
			Scanner sc = new Scanner(System.in);
			numero = sc.nextInt();
			totalNumeros++;
			soma += numero;
			
		} while (numero!=0);
			totalNumeros--;
		
		media = (double) soma / totalNumeros;
		System.out.println("A média é: " + media );

	}
}