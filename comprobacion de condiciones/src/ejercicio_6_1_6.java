import java.util.Scanner;

public class ejercicio_6_1_6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca su usuario: ");
		int login = teclado.nextInt();
		System.out.print("Introduzca su Password: ");
		int pss = teclado.nextInt();
		while(login!=1809 || pss!=1234) {
			System.out.println("Su usuario o pss es incorrecto, vuelva introducirlo");
			System.out.print("Introduzca su usuario: ");
			login = teclado.nextInt();
			System.out.print("Introduzca su Password: ");
			pss = teclado.nextInt();
		}
		System.out.print("Has sido logeado");
		
	}

}
