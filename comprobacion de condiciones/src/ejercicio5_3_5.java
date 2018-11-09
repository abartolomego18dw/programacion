import java.util.Scanner;

public class ejercicio5_3_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el primer numero: ");
		 int primero = teclado.nextInt();
		 if(primero%2==0) {
			 System.out.print("El numero es par");
		 	}
		 else {
			 System.out.print("El numero es impar");
		 }
		}

}
