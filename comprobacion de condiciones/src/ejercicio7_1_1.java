import java.util.Scanner;

public class ejercicio7_1_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean par;
		System.out.print("Introduzca un numero: ");
		int num = teclado.nextInt();
		if(num%2==0)
			par=true;

		else 
			par=false;
	System.out.print("el valor de par es: "+par);
	}
	
}
