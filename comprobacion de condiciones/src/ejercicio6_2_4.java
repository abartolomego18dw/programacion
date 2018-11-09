import java.util.Scanner;

public class ejercicio6_2_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el primer numero: ");
		int x= teclado.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int y= teclado.nextInt();
		
		if(y!=0 || x!=0) {
		do {
			System.out.println(x+"+"+y+"="+(x+y));
			System.out.print("Vuelva a introducir el primer numero: ");
			x= teclado.nextInt();
			System.out.print("Vuelva a introducir el segundo numero: ");
			y= teclado.nextInt();

		}

		while(y!=0 || x!=0);
		}
	System.out.print("FIIIIIIIN!!!!!!!!!!!");
			
		}
	
}
