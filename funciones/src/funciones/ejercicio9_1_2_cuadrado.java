package funciones;

import java.util.Scanner;

public class ejercicio9_1_2_cuadrado {

public static void cuadrado(int num) {
	
	int i;
	int j;
	for (i=1; i<=num;i++){
		for (j=1;j<=num;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num2;
		System.out.print("Dime un numero: ");
		num2 = sc.nextInt();
		
		cuadrado(num2);

	}

}
