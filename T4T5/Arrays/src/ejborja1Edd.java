import java.util.Scanner;

public class ejborja1Edd {

	private static Scanner teclado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//solicita una cadena y di que parte de la cadena transformas en mayusculas
		
		String primertexto="";
		String segundotexto="";
		String[] primertextomayuscula=null;
		
		System.out.println("primer texto");
		primertexto=teclado.nextLine();
		System.out.println("segundo texto");
		segundotexto=teclado.nextLine();
		primertextomayuscula = primertexto.split(" ");
		
		
		for (int i=0;i<primertextomayuscula.length;i++) {
		if (segundotexto.equals(primertextomayuscula[i])) {
			System.out.println(primertextomayuscula[i].toUpperCase()+" ");
		}else {
			System.out.println(primertextomayuscula[i] + " ");
		}
		}
		
		
		
			
		
	}

}
