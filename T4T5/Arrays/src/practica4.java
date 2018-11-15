import java.util.Scanner;//Introduce 10 valores y los imprime
public class practica4 {
public static final int NUM_VALORES =10;
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
	
System.out.println("Escribe "+NUM_VALORES+" enteros.");
int numValoresLeidos=0,valor=0;
int[]numeros=new int [NUM_VALORES];
while (numValoresLeidos< NUM_VALORES) {
	if (lector.hasNextInt()) {
	 valor=lector.nextInt();
		System.out.println("Valor "+numValoresLeidos+" leido= "+valor);
		numeros[numValoresLeidos]=valor;
		numValoresLeidos++;
	}else {
		lector.next();
	}
}
System.out.println();
for (int i=0;i<numeros.length;i++) {
	System.out.println(numeros[i]);
	
}
		 lector.close();
	}
}