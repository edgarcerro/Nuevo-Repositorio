import java.util.Scanner;//Introduce un texto y te imprime la primera letra de cada palabra en mayuscula

public class practica23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce una frase y te saco el acrónimo");
		
		String dni=teclado.nextLine();
		String[] d=dni.split(" ");
		String cadena="";	
				
		
				for (int i=0;i<d.length;i++) {
				
					cadena+=d[i].substring(0,1).toUpperCase();
					
				}
		
		
		System.out.println(cadena);
		
		
		
		
	}

}
