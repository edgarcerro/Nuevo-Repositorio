import java.util.Scanner;
public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de asteriscos que quieres que imprima");
		int numero = teclado.nextInt();
		for (int i = 0;i < numero;i++) {
			System.out.print("*");
		}
		teclado.close();	
		
	}

}
