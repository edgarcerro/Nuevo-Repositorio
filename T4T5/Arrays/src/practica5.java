import java.util.Scanner;//Introduce 10 valores y los imprime cuando es -1 acaba
public class practica5 {
public static final int NUM_VALORES =10;
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
System.out.println("Escribe "+NUM_VALORES+" enteros.Puedes hacerlo en diferentes lineas");
int numValoresLeidos=0,valor=0;
int[]numeros=new int [NUM_VALORES];
while (numValoresLeidos< NUM_VALORES && valor != -1) {
	if (lector.hasNextInt()) {
	 valor=lector.nextInt();
		System.out.println("Valor "+numValoresLeidos+" leido= "+valor);
		if(valor!=-1) {
		numeros[numValoresLeidos]=valor;
	}
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
