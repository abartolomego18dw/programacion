import java.util.Scanner;

public class ejercicio6_3_6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el alto: ");
		byte ancho = teclado.nextByte();
		
		System.out.print("Introduzca el ancho: ");
		byte alto = teclado.nextByte();
		
		int x,y;
		
		for(x=0; x<ancho;x++) {
			for(y=0; y<alto; y++) {
				System.out.print("*");
			}	
			System.out.println("@");
			}
		
		

		}

}
