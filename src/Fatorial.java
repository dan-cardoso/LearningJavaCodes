import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		int numero = 0;
		int fatorial = 1;
		int i = 2;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
			do {
				fatorial *= i;
				i++;
			} while (i <= numero);
			
			System.out.print("O Fatorial Do Número " + numero + " é " + fatorial);
		}

		
	
}
