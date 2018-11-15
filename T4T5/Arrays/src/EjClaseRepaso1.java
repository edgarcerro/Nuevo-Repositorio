import java.util.Scanner;//Introduce el tamaño del string y imprime los numero que acaben por la cifra que introduzcas
public class EjClaseRepaso1 {

	public static void main(String[] args) {
		  System.out.println("Introduce el tamaño");
		  Scanner sc = new Scanner(System.in);
	int tamaño=sc.nextInt();
		  String[]numtamaño=new String[(tamaño+1)];
	 System.out.println("El string creado es desde 1 hasta "+(tamaño));
	 
	 System.out.println("Introduce un número para imprimir los numeros que acaben por ese numero");
	 
	 int numero=sc.nextInt();
	 
	 for (int i=1;i<tamaño;i++) {
		int ultimodigito = i%10;
		if (ultimodigito==numero) {
			System.out.println(i);
		}
	    }
	 
	}
}