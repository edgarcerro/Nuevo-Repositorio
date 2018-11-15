import java.util.Scanner;//introduce un texto y busca el primer y el ultimo caracter que quieras
public class practica20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		String palabra="";
		char letra= '/' ;
		int posicion=0;
		int posicionfinal=0;
		
		System.out.println("Introduce una palabra: ");
		palabra=teclado.nextLine();
		System.out.println("Caracter a buscar");
		letra=teclado.next().charAt(0);
		teclado.close();
		
		if(palabra.indexOf(letra)==-1) {
			System.out.println("Caracter no encontrado");
			
		}else {
			posicion=palabra.indexOf(letra);
			posicionfinal=palabra.lastIndexOf(letra);
			System.out.println("La primera ocurrencia es "+(posicion+1));
			System.out.println("La ultima ocurrencia es "+(posicionfinal+1));
		}
		
				
	
	}

}
