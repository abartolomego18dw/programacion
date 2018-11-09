 import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int opcion;
		
		for(;;) 
		{
		System.out.println("1.Saber que digitos tiene");
		System.out.println("2.Cuantas veces aparece un digito");
		System.out.println("3.Hallar el invertido de un numero");
		System.out.println("4.factorial");
		System.out.println("5.triangulo");
		System.out.println("6.De binario a decimal");
		System.out.println("7.Saber cuantas vocales hay en una frase");
		System.out.println("8.Tabla de multiplicar del 1 al 10");
		System.out.println("9.Salir");
		System.out.print("eliga una opcion: ");
		opcion = teclado.nextInt();
		
		switch(opcion) {
		
		case 1:
			int cont=0,num;
			
			do {
				System.out.print("Dame un positivo: ");
				num = teclado.nextInt();
			}
			while(num<0);
			
			while(num!=0) {
				num = num/10;
				cont++;
				}
			System.out.println("tiene "+cont+" digitos");
			System.out.println("");
		break;
		
		case 2:
			int numero, num2, digito, cont2=0;
			System.out.print("Dime un numero: ");
			num2 = teclado.nextInt();
			numero = num2;
			System.out.print("Dime el digito: ");
			digito = teclado.nextInt();
			
			while(num2>0) {
				if(num2%10==digito)
				cont2++;
				num2=num2/10;
			}
			System.out.println("El "+numero+" tiene "+cont2+" "+digito+"s");
			System.out.println();
		break;
		
		case 3:
			System.out.print("Introduzca un numero: ");
			int num3 = teclado.nextInt();
			int r = 0;
			while(num3>0) {
				r=num3%10;
				num3=num3/10;
				System.out.print(r);	
			}
			System.out.println();
		break;
		
		case 4:
			System.out.print("Dime un numero: ");
			int num4 = teclado.nextInt();
			int factorial=1;
			while(num4!=0) {
				factorial*=num4;
				num4--;
				}
			System.out.println(factorial);
			System.out.println();
		break;
		
		case 5:
			System.out.print("Dime un numero: ");
			int num5 = teclado.nextInt();
			for (int i=1;i<=num5;i++) {
				for(int x=1;x<=i;x++) {
					System.out.print("*");
				}
			System.out.println();
			}
			for (int i = num5;i>=1;i--) {
				for(int x=1;x<=i;x++) {
					System.out.print("*");
					}
				System.out.println();
				}
		break;
		
		case 6:
			System.out.print("Dime un numero binario: ");
			
			int num6 = teclado.nextInt();
			int max=num6;
			int resto;
			int z;
			int resultado = 0;
			int cont1 = 0;
			while(max!=0) {
				max = max/10;
				cont1++;
				}
			for(z=0;z<=cont1;z++) {
				resto=num6%10;
				num6=num6/10;
				resultado=(int)Math.pow(2, z)*resto+resultado;	
			}
			System.out.println("El numero binario en decimal es: "+resultado);
			System.out.println();
		break;
		
		case 7:
			System.out.print("Escribeme una frase: ");
			String texto = teclado2.nextLine();

			int cont3=0;		
			for(int x=0; x<=texto.length()-1;x++) {
			if((texto.charAt(x)=='a') || (texto.charAt(x)=='e') || (texto.charAt(x)=='i') || (texto.charAt(x)=='o') || (texto.charAt(x)=='u'))
				cont3++;
			}
			System.out.println("La frase "+texto+" tiene "+cont3+" vocales");
			System.out.println();
		break;
		
		case 8:
			for(int x=0;x<=10;x++) {
				System.out.println();
				System.out.println("Tabla del: "+x);
				System.out.println();
				
				for(int y=0;y<=10;y++)
						System.out.println(x+"*"+y+" = "+(x*y));
			}
			System.out.println();
		break;
		
		case 9:
			System.out.println();
			System.out.println("Salir");
        		System.exit(0);		
		
		default: System.out.println("Error, el numero  tiene que estar entre el 1 y el 9");
		System.out.println("");
		break;
			}
		}
	
	}

}
