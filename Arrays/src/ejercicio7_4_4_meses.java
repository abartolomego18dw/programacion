import java.util.Scanner;

public class ejercicio7_4_4_meses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int i;
		String mes[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		System.out.print("Dime un mes: ");
		i =sc.nextInt();
		while(i<=12 && i>0){
			System.out.println(mes[i-1]);
			System.out.print("Dime de nuevo: ");
			i = sc.nextInt();
		}
		System.out.print("Fin...");
	}

}
