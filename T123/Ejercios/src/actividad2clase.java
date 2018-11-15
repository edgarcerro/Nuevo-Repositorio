import java.util.Scanner;

public class actividad2clase {
static final String kASTERISCO="*";
static final String kESPACIOS=" "
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int altura=0;
		int asteriscos=-1;
		int espacios=0;
		
		System.out.println("Introduce la altura");
		
		Scanner teclado=new Scanner (System.in);
		while(!teclado.hasNextInt()) {
			System.out.println("Altura incorrecta");
		teclado.next();
		}
		
		altura=teclado.nextInt();
		teclado.close();
		
		espacios=altura;
		
		for (int i = 0; i < altura; i++) {
	    asteriscos+=2;
	    espacios--;
	    for (int j = 0; j< espacios; j++) {
	    	System.out.print(kESPACIO);
	    }
	    for (int k=0;k>asteriscos;k++) {
	    	System.out.print(kASTERISCO);
	    }
	    System.out.print("/n");
		}

}
}
