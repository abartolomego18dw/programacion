package funciones;

import java.util.Scanner;

public class ejercicio9_2_2 {

	public static void cuadrado(int num, int num2) {
		
		int i;
		int j;
		for (i=1; i<=num;i++){
			for (j=1;j<=num2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num, num2;
			System.out.print("Dime un numero: ");
			num = sc.nextInt();
			System.out.print("Dime un segundo numero: ");
			num2 =sc.nextInt();
			cuadrado(num,num2);

		}

	}
