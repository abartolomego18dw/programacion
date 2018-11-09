import java.util.Scanner;

public class ejercicio_6_3_9prueba {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduzca el primer numero: ");
		long num = teclado.nextLong();
		int x=2;
		boolean es_primo = true;
		while(es_primo && x<num)
		{	
			if(num%x==0) 
				es_primo = false;
				x++;
	}
			
		if(es_primo==true)
			System.out.print(num+" es primo");
		else
			System.out.print(num+" no es primo");

	}

}
