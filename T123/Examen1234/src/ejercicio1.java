package examen123;

import java.util.Scanner;

public class ejercicio1 {
	// Alumno:Edgar Cerro Rabanal 1ºDAW
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número entero mayor que 0");
		int numero = sc.nextInt();

		while (numero <= 0) {
			System.out.println("ese numero no es entero o mayor que 0, introduce otro");
			numero = sc.nextInt();
		}

		System.out.println("Si quieres par introduce *1* si quieres impar introduce *2*");
		int opcion = sc.nextInt();
		sc.close();
		switch (opcion) {

		case 1:
			for (int start = 0; numero >= start; start += 2) {
				System.out.println(start);

			}
			break;
		case 2:

			for (; numero >= 0; numero -= 2) {
				
				if (j % 2!=0) {
					System.out.println(numero);
				}
			}
			break;
		}
	}

}
