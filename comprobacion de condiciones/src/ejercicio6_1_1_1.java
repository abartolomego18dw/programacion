import java.util.Scanner;

public class ejercicio6_1_1_1 {

	public static void main(String[] args) {
	int suma=0;
		
	Scanner teclado = new Scanner(System.in);
	System.out.print("introduzca un cero: ");
	int dato = teclado.nextInt();
		while(dato!=0) {
			suma= suma+dato;
			System.out.println("la suma de los numeros introducidos es: "+suma);			System.out.print("No era cero. Introduzca cero: ");
			dato= teclado.nextInt();
			
			
		}
		System.out.print("Terminado");
	}
		
	
}
