package funciones;

import java.util.Scanner;

public class ejercicio9_3_2 {

	public static void menor(int i, int j) {
		
		if(i>j) {
			System.out.print(j+" es menor que "+ i);
		}
		else {
			System.out.print(i+" es menor que "+ j);
		}		
}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Dame un numero: ");
	int num = sc.nextInt();
	System.out.print("Dame un numero: ");
	int num2 = sc.nextInt();
	menor(num, num2);
	
	}

}
