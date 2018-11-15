import java.util.Scanner;

public class poligono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eleccion = "";
		float resultado = 0.0F;
		int base, altura;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Dime un tipo de poligono");
			System.out.println("***********************");
			System.out.println("*triangulo*");
			System.out.println("*cuadrado*");
			System.out.println("*rectangulo*");
			System.out.println("***********************");
			System.out.println("");

			eleccion = sc.nextLine();
         
		} while (!eleccion.equals("triangulo") && !eleccion.equals("cuadrado") && !eleccion.equals("rectangulo"));
		System.out.println("tu eleccion es: " + eleccion);

		switch (eleccion) {
		case "triangulo":
			System.out.println(eleccion);
			System.out.println("dime la base");
			base = sc.nextInt();
			System.out.println("dime la altura");
			altura = sc.nextInt();
			resultado = (base * altura / 2);
			break;
		case "cuadrado":
			System.out.println(eleccion);
			System.out.println("dime la base");
			base = sc.nextInt();
			System.out.println("dime la altura");
			altura = sc.nextInt();
			resultado = (base * altura);
			break;
		case "rectangulo":
			System.out.println(eleccion);
			System.out.println("dime la base");
			base = sc.nextInt();
			System.out.println("dime la altura");
			altura = sc.nextInt();
			resultado = (base * altura);
			break;

		}
		System.out.println("El resultado de tu operacion es: " + resultado);
		 sc.close();
	}

}
