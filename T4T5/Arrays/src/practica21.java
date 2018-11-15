import java.util.Scanner;
public class practica21 {//Acertar palabra secreta

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner (System.in);
		String palabra="hola loco";
		String palabraAdivina="";
		do {
		System.out.println("Introduce la palabra secreta");
		palabraAdivina=sc.nextLine();
		}while(!palabra.equals(palabraAdivina));
		
		System.out.println("Felicidades, has acertado");
		sc.close();
		
		
	}

}
