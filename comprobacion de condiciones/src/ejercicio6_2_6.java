import java.util.Scanner;

public class ejercicio6_2_6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un lado: ");
		byte medidas=teclado.nextByte();
		byte alto =1;
		
		do {
			byte ancho=1;
		do {
			System.out.print("*");
			ancho++;
		}
		while(ancho<=medidas);
			System.out.println();
			alto++;
		}
		while(alto<=medidas);
			
		}

}
