import java.util.Scanner;//Escribe 10 numeros, te los ordena y imprime

public class ej1 {
private int[] llistaenters = new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ej1 programa = new ej1();
		programa.inici();
	}
public void inici() {
	llegirllista();
	ordenarllista(); 
	mostrarllista();
}
public void llegirllista() {
	Scanner teclado =new Scanner(System.in);
	for (int i=0;i < llistaenters.length;i++) {
		System.out.println("Introduce el numero"+(i+1));
		while (!teclado.hasNextInt()){
		teclado.next();
		}
		llistaenters[i] = teclado.nextInt();
	}
	teclado.close();

}
public void ordenarllista(){
	for(int i=0;i<llistaenters.length-1;i++) {
		for(int j = i;j < llistaenters.length;j++) {
			if(llistaenters[i] > llistaenters[j]) {
				int canvi=llistaenters[i];
				llistaenters[i]=llistaenters[j];
				llistaenters[j]=canvi;
			}
		}
	}
}
public void mostrarllista() {
	for(int i=0;i<llistaenters.length;i++) {
		System.out.println(llistaenters[i]);
	}
}


}

