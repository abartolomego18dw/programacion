package funciones;

public class ejercicio9_3_1_cubo {

	public static float cubo( double numero ) { 
        float num= (float) Math.pow(numero, 3);
		return num;
  
    }
 
 
    public static void saludar( ) {         
        System.out.println( "Bienvenido"); 
        System.out.println( "Comenzamos..."); 
    }
 
    public static void escribircubo( double numero ) {       
        System.out.println( "el cubo de " + numero + " es " + cubo( numero )); 
    }
 
    public static void main( String args[] ) { 
        saludar();
        escribircubo(5);
        escribircubo(3.2);
    } 
} 
 