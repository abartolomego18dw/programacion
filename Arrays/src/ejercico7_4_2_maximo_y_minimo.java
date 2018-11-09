import java.util.Scanner;

public class ejercico7_4_2_maximo_y_minimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]num =new int[8];
		int i;
		int mayor =0;
		int menor = mayor;
		
		for(i=0; i<num.length;i++) {
			System.out.print("Dame un numero: ");
			num[i] = sc.nextInt();
		}
		for(i=0;i<num.length;i++) {
			if(mayor<=num[i])
				mayor=num[i];
		}
		
		for (i=0;i<num.length;i++) {
			if(menor>=num[i])
				menor=num[i];
		}
		System.out.println("El numero mas alto es el: "+mayor+" y el menor el: "+menor);
		}

}
