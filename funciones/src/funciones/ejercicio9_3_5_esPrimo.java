package funciones;

import java.util.Scanner;

public class ejercicio9_3_5_esPrimo {

public static boolean esprimo(int i) {
	boolean esprimo=true;
	
		
		for(int j = 2;j<i;j++) {
			if(i%j==0)
				esprimo=false;	
		}
		if(esprimo==true)
			return esprimo;
		else 
			return esprimo;


			
			
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un numero: ");
		int num = sc.nextInt();

		
		System.out.print(esprimo(num));
	}

}
