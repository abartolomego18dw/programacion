import java.util.Scanner;

public class ejercicio6_3_8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduzca el primer numero: ");
		long num = teclado.nextLong();
		int x;
		for(x=1; x<=num; x++)
			if(num%x==0)
				System.out.print(x+" ");
	}

}
