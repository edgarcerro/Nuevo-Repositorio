import java.util.Scanner;

public class practica17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limite=0,total=0;
		Scanner teclado=new Scanner (System.in);
	
		while (!teclado.hasNextInt()) {
			teclado.next();
		}
	limite = teclado.nextInt();
	teclado.close();
	
	for (int i = 0 ;i <= limite ; i++) {
		if (i % 3 == 0) {
			total=total + i;
		}
	}
	}

	}
