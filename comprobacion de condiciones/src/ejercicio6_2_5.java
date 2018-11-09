import java.util.Scanner;

public class ejercicio6_2_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca su usuario: ");
		int login= teclado.nextInt();
		System.out.print("Introdusca su contraseña: ");
		int pss= teclado.nextInt();
		if(login!=1809 || pss!=1234){
		do {
			System.out.println("Error");
			System.out.print("introduzca usuario: ");
			login = teclado.nextInt();
			System.out.print("Introduzca su pss: ");
			pss = teclado.nextInt();
		}
		while(login!=1809 || pss!=1234);
		}
		System.out.print("Correcto");
	}

}
