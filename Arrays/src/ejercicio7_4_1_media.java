import java.util.Scanner;

public class ejercicio7_4_1_media {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		double []num = new double [5];
		double total=0;
		int i;
		for (i=0; i<num.length; i++) {
			System.out.print("Dime un numero entero: ");
			num[i]= sc.nextDouble();
			total = total+num[i];
		}
		double total1=total/i;
		System.out.println("La media es: "+total+"/"+i+"="+total1);
		
		System.out.print("Los numeros mas grandes que la media son: ");
		for(i=0; i<num.length;i++) {
		if(num[i]>total1)
			System.out.print(num[i]+" ");
		}
	}
}


