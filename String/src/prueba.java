import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		int num;
		int num2;
		
		for(;;)
		{
			
				System.out.println("1.sumar");
				System.out.println("2.restar");
				System.out.println("3.multiplicar");
				System.out.println("4.dividir");
				System.out.println("5.Salir");
				System.out.print("Eliga una opcion: ");
				opcion= teclado.nextInt();
				System.out.println("");
				
				switch(opcion) {
				case 1 : System.out.print("introduzca el primer numero: ");
				num = teclado.nextInt();
				System.out.print("Introduzca el segundo numero: ");
				num2 = teclado.nextInt();
				System.out.println("la suma es: "+(num+num2));
				System.out.println("");
				break;
				
				case 2 : System.out.print("introduzca el primer numero: ");
				num = teclado.nextInt();
				System.out.print("Introduzca el segundo numero: ");
				num2 = teclado.nextInt();
				System.out.println("la resta es: "+(num-num2));
				System.out.println("");
				break;
				
				case 3 : System.out.print("introduzca el primer numero: ");
				num = teclado.nextInt();
				System.out.print("Introduzca el segundo numero: ");
				num2 = teclado.nextInt();
				System.out.println("la multiplicacion es: "+(num*num2));
				System.out.println("");
				break;
				
				case 4 : System.out.print("introduzca el primer numero: ");
				num = teclado.nextInt();
				System.out.print("Introduzca el segundo numero: ");
				num2 = teclado.nextInt();
				System.out.println("la dvision es: "+(num/num2));
				System.out.println("");
				break;
				
				case 5 : System.out.println("Salir");
				        System.exit(0);
				break;
				
				default: System.out.println(" El numero  tiene que estar entre el 1 y el 5");
				System.out.println("");
				break;
				}
				
				
				}
		
	}

}
