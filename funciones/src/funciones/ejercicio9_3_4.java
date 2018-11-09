package funciones;

import java.util.Scanner;

public class ejercicio9_3_4 {
public static char primeraletra(String palabra) {
		
		return(palabra.charAt(palabra.length()-1));
	
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime una palabra: ");
		String i = sc.next();		
		System.out.print("La primera letra es: "+primeraletra(i));
		

	}
}