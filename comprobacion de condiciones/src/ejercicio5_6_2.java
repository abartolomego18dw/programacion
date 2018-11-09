import java.util.Scanner;

public class ejercicio5_6_2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int menor;
		System.out.print("Introduzca un numero: ");
		int x = teclado.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		int y = teclado.nextInt();
		menor = x<y ? x : y;
		
		System.out.print("\"menor\" vale.... "+menor);
		

	}

}
