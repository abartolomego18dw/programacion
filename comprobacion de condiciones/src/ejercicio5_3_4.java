import java.util.Scanner;

public class ejercicio5_3_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el primer numero: ");
		 int primero = teclado.nextInt();
		 	if(primero%3==0) {
		 		System.out.print("El numero es multiplo de 3");
		 	}
		 	else {
		 		System.out.print("El numero no es multiplo de 3");		 	}
	}

}
