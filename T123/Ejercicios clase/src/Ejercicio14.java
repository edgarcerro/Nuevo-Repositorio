import java.util.Scanner;
public class Ejercicio14 {

	private static Scanner teclado;

	public static void main(String[] args) {
	
		int numero=0;
		
		teclado = new Scanner(System.in);
	
	
	System.out.println("Introduce un número");
		
		do {	
			numero=teclado.nextInt();
			System.out.println("Ese numero esta entre 0 y 10, prueba otro");
		} while (numero <=10);
System.out.println("Bien hecho");

	
	}

	
	
	
}
