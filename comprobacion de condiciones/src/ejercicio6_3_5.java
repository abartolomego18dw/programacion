import java.util.Scanner;

public class ejercicio6_3_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int dato =teclado.nextInt();
		for(int x=0; x<=dato;x++) {
			if(x%3==0 && x%7==0)
				System.out.print(x+" ");
		}
	}

}
