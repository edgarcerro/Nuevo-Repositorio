import java.util.Scanner;

public class ej2 {

	private int[] llistaEnters = new int[10];
	private int mitadMayor=0;
	private int inferiores=0;
	public static void main(String[] args) {
		ej2 programa = new ej2();
		programa.inici();
	}
	public void inici() {
		llegirLlista();
		ordenarLlista();
		mostrarLlista();
		calcularMitadMayor();
		calcularInferiores();
		mostrarInferiores();
	}
	public void llegirLlista() {
		Scanner teclado = new Scanner(System.in);
		for(int i = 0;i<llistaEnters.length;i++) {
			System.out.print ("introduce el numero (i+1)"+ " : " );
			teclado.next();
			llistaEnters[i]= teclado.nextInt();
		}
		
		teclado.close();
	}
	

	
	public void ordenarLlista() {
		int canvi=0;
		for(int i =0;i<llistaEnters.length -1;i++) {
			for(int j=i+1;j<llistaEnters.length; j++) {
				if(llistaEnters[i]>llistaEnters[j]) {
					canvi = llistaEnters[i];
					llistaEnters[i]=llistaEnters[j];
					llistaEnters[j]=canvi;
				}
			}
		}
	}
	public void mostrarLlista() {
		for (int i = 0;i<llistaEnters.length;i++) {
			System.out.println(llistaEnters[i]);
		}
	}
	public void calcularMitadMayor () {
		for (int i =0;i<llistaEnters.length;i++) {
			if(llistaEnters[i]/2>mitadMayor) {
				mitadMayor=llistaEnters[i]/2;
			}
		}
		
	}
	public void calcularInferiores() {
		for(int i =0;i<llistaEnters.length;i++) {
			if(llistaEnters[i]<mitadMayor) {
				inferiores++;
				
			}
		}
	}
	public void mostrarInferiores() {
		System.out.println("hay "+ inferiores+" numeros menores de la mitad del mayor.");;
	}
}