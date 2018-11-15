import java.util.Scanner;//introducir numero de notas y poner cada nota para luego imprimirlas
public class practica7 {

	public static void main(String[] args) {
		
		int[] notas;
		int nota=0;
		int cantidad =0;
		
		int numeronotas=0;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce cuantas notas se van a leer");
		numeronotas=lector.nextInt();
	while(numeronotas < 0) {
		System.out.println("Has introducido un número erróneo = "+numeronotas+".Introduce otro");
		lector.next();
		}
	cantidad=lector.nextInt();
	while(cantidad<1) {
		System.out.println("introduce un valor mayor que 0");
		cantidad=lector.nextInt();
	}
	notas=new int [cantidad];
	
	for (int i=0;i<=cantidad;i++) {
		System.out.println("introduce la nota");
		nota=lector.nextInt();
		while(nota<0 || nota >10) {
			System.out.println("introduce un valor entre 0 y 10");
			nota=lector.nextInt();
		}
		notas[i]=nota;
	}
	for (int j =0;j<=notas.length;j++) {
		System.out.println(notas[j]+" ");
	}
	lector.close();
	}
}

