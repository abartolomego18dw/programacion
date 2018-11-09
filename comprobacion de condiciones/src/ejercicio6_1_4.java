import java.util.Scanner;

public class ejercicio6_1_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int num = teclado.nextInt();
		while(num!=0) {
			System.out.println(num*num);
			System.out.print("Introduzca un nuevo numero: ");
			num = teclado.nextInt();
		}
	System.out.print("Has introducido el "+num+"...FIN");	
	}


}
