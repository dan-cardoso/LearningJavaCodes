import java.util.Scanner;

public class CategoriaElseIf {

	public static void main(String[] args) {
		int idade = 0;
		
		System.out.print("Digite sua idade: ");
		Scanner sc = new Scanner(System.in);
		idade = sc.nextInt();
		
		if (idade <= 7 && idade >= 5 ) {
			System.out.println("A categoia do aluno é INFANTIL A");
		} else if (idade >= 8 && idade <= 10 ) {
			System.out.println("A categoia do aluno é INFANTIL B");
		} else if (idade >= 11 && idade <= 13 ) {
			System.out.println("A categoria do aluno é JUVENIL A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("A categoria do aluno é JUVENIL B");
		} else if (idade >= 18) {
			System.out.println("A categoria do aluno é ADULTO");
		} else {
			System.out.println("Faixa etária não válida para as categorias");
		}
}
}