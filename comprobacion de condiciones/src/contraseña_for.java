import java.util.Scanner;

public class contrase�a_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int intento = 3;
		int i;
		for(i = 1;i<=intento;i++) {
			System.out.print("Introduzca contrase�a: ");
			int num = teclado.nextInt();
			if(num!=1234)
				System.out.println(i+" intento, contrase�a incorrecta ");
			else
				break;
		}
		if (i<=3)
				System.out.print("Su contrase�a es correcta");
		else
			System.out.print("no tiene mas posibilidades.");
	}

}
