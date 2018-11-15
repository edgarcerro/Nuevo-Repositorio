import java.util.Scanner;
public class Practica14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]valores= {1,4,5,8,7,5,6,9,8,4,1,2,5,7,5,};
		int contador=0;
		System.out.println("Introduce un numero y te digo cuantas veces esta en el array");
		int numero=sc.nextInt();
		
		for(int i=0;i<valores.length;i++) {
			if(valores[i]==numero) {
				contador++;
			}
		}
		System.out.println("El número "+numero +" está "+contador+" veces en el array");
		sc.close();
	}


}

