import java.util.Scanner;

public class ejercicio7_3_1_4 {

	public static void main(String[] args) {
		System.out.print( "¿Cómo te llamas? ");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.next();
        int i;
       
        for(i=0;i<nombre.length();i++)
        	if(i==0)
        	System.out.print(nombre.toUpperCase().substring(0,1));
        	else
        	System.out.print(nombre.toLowerCase().substring(i,i+1));
        	
        	
        

	}

}
