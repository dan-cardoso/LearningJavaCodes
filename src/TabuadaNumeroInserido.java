import java.util.Scanner;

public class TabuadaNumeroInserido {

	public static void main(String[] args) {
		int numero = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Informe um número: ");
		numero = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
		System.out.println(numero + " x " + i + " = " + (numero * i));
	}

}
}