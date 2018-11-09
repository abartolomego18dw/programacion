import java.util.Scanner;

public class ejercicios5_3_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un numero: ");
		int numero = teclado.nextInt();
		if(numero>0) {
			System.out.print("Es mayor que 0");
		}
		else {
			if(numero<0) {
				System.out.print("es menor que 0");
			}
			else {
				System.out.print("Es 0");
			}
		}
	}
}
		
			
				
			
			

	

