package funciones;

import java.util.Scanner;

public class ejercicio9_1_1_BorrarPantalla {
	public static void BorrarPantalla(int num) {
		
		int i;
		
		for(i=1;i<=num;i++)
			System.out.println("*");
	}
public static void main( String args[]){
	Scanner sc = new Scanner(System.in);
	int j = sc.nextInt();
	BorrarPantalla(j);
}

}
