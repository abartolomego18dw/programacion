import java.util.Scanner;

public class ejercicio6_1_7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numuero:");
		int num= teclado.nextInt();
		int cont=1;
		while(cont<=num) {
			System.out.print("*");
			cont++;
			}
	}

}
