import java.util.Scanner;

public class ejercicio6_3_9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int i, j;
		boolean esprimo;
		System.out.print("Introduzca el primer numero: ");
		int rInicial = teclado.nextInt();
		System.out.print("introduzca el segundo: ");
		int rFinal =teclado.nextInt();
		
		for(i = rInicial; i<=rFinal; i++) {
			esprimo=true;
			
			for(j=2;j<i;j++) {
				if(i%j==0)
					esprimo=false;
			}
		}
		if(esprimo=true) {
			System.out.print(i+" ");
		}
	}
}
