import java.util.Scanner;

public class ejercicio_5_4_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el primer numero: ");
		 int primero = teclado.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		 int segundo = teclado.nextInt();
		 if ((primero>=0) || (segundo>=0)){
			 System.out.print("Uno de ellos es positivo");
		 }
		 else {
			 System.out.print("los numero son negativos");
		 }
	}

}
