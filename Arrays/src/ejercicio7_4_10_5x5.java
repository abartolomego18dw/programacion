
public class ejercicio7_4_10_5x5 {

	public static void main(String[] args) {

		int i,j;
		char [][] dato = new char[5][5];
		
		for(i=0;i<dato.length;i++)
			for(j=0;j<dato.length;j++)
			if(i==1)
				dato[i][j]='A';
			else
				dato[i][j]='.';
		
		for(i=0;i<dato.length;i++) {
			for(j=0;j<dato.length;j++) {
				System.out.print(dato[i][j]);
				}
				System.out.println();
		}
	}
}

