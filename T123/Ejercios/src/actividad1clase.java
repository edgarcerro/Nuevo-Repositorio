import java.util.Scanner;

public class actividad1clase {

	public static void main(String[] args) {
		
		int numero=0;
		int valorposicion=0;
		int total=0;
		
		Scanner teclado=new Scanner(System.in);
		
		while(!teclado.hasNextInt()) {
			System.out.println("no vale");
			teclado.next();
		}

		numero=teclado.nextInt();
		
		while(numero!=0) {
			valorposicion=numero%10;
			total+=Math.pow(valorposicion, 3);
			numero=numero/10;
					
		}
		System.out.println(total);
		teclado.close();
	}

}
