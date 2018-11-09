import java.util.Scanner;

public class ejercicio_7_4_3_dia_meses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] mes = {31,28,31,30,31,30,31,31,30,31,30,31};
		int i;
		
		System.out.print("Dime un mes: ");
		i = sc.nextInt();
		
		while(i<=12 && i>0) {
			System.out.println(mes[i-1]);
			System.out.print("Dime de nuevo un mes: ");
			i = sc.nextInt();
	}
			System.out.print("No es un mes, ...Fin...");
	}

}
