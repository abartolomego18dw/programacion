import java.util.Scanner;

public class ejercicio5_3_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un nUmero: ");
		int numero = teclado.nextInt();
		if (numero==12) {
			System.out.print("Es correcto");
		}
		else {
			System.out.print("No es correcto");
		}
	}

}
