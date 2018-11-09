import java.util.Scanner;

public class ejercicio5_3_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el primer numero: ");
		 int primero = teclado.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int segundo = teclado.nextInt();
		if (primero>segundo) {
			System.out.print(primero+" es el numero mayor");
		}
		else {
			System.out.print(segundo+" es el numero mayor");
		}
	}

}
