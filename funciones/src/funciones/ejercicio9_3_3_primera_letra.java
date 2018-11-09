package funciones;

import java.util.Scanner;

public class ejercicio9_3_3_primera_letra {

	public static char primeraletra(String palabra) {
		
		return(palabra.charAt(0));
	
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime una palabra: ");
		String i = sc.next();		
		System.out.print("La primera letra es: "+primeraletra(i));
		

	}

}
