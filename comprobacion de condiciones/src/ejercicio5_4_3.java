import java.util.Scanner;

public class ejercicio5_4_3 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		int primer = teclado.nextInt();
		System.out.print("Introduzca el segundo: ");
		int segundo = teclado.nextInt();
		int contador= 0;
		if(primer%2==0) contador= contador+1;
		if(primer%2==0) contador= contador+1;
		System.out.print("Hay "+contador+" numeros pares" );
	}

}
