import java.util.Scanner;

public class ejercicio5_2_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escriba un numero: ");
		int numero = teclado.nextInt();
		if (numero>=0) {
			System.out.print("Es positivo");
		}
		else {
		System.out.print("Es negativo");
		}
	}
		

}
