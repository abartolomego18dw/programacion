import java.util.Scanner;

public class ejercicio6_3_7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el primer numero: ");
		byte x = teclado.nextByte();
		int ancho;
		int alto;
		
		for(ancho=1; ancho<=x; ancho++) {
			
			for(alto=1; alto<=x; alto++) { 
				if(ancho==1 || ancho==x || alto==1 || alto==x)
					System.out.print("*");
				else
					System.out.print(" ");}
			
			
				System.out.println();
				
			}
				

	}

}
