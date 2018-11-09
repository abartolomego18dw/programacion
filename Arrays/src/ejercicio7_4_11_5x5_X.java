
public class ejercicio7_4_11_5x5_X {

	public static void main(String[] args) {
		int i,j;
		char [][] dato = new char[5][5];
		
		for(i=0;i<dato.length;i++)
			for(j=0;j<dato.length;j++)
			if(i==j)
				dato[i][j]='X';
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
