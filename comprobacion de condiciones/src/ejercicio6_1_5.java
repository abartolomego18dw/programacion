import java.util.Scanner;

public class ejercicio6_1_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca su contraseña: ");
		int num = teclado.nextInt();
		int cont=1;
		while(num!=1234 && cont<=3) {
				System.out.print("Su contraseña es incorrecta, vuelva a introducirla: ");
				cont++;
				num = teclado.nextInt();
				
			}
		if (num==1234)
			System.out.println("es correcto");
		else
			System.out.println("Error");
		System.out.println("Has intentado: "+cont+" veces");
	}

}
