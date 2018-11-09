import java.util.Scanner;

public class notas2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime su nota: ");
		float nota = teclado.nextFloat();
		
		if(nota<5)
			System.out.print("Tiene un insuficiente");
		else {
		
		if(nota<=6)
			System.out.print("Tiene un bien");
			
			else {
				
				if(nota<=8)
					System.out.print("Tiene un notable");
				
				else {
					System.out.print("Tiene un sobresaliente");
				}
			}
		}
		
	}

}
