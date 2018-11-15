import java.util.Scanner;

public class piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("por favor dame un numerito");
		int filas=0;
		int numero=0;
		Scanner sc = new Scanner(System.in);
		
		while (!sc.hasNextInt()) {
			System.out.println("Tiene que ser entero");
			sc.next();
		}
		
		filas=sc.nextInt();
		sc.close();
		
		numero=filas;
		
		for(int i=1;i<=filas;i++) {
			for(int j = 1; j<= numero; j++) {
				System.out.print(j);
			}
			numero=numero-1;
			System.out.print("\n");
			}
		
		
	
		}
	}


