import java.util.Scanner;
public class Practica16 {
	private Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practica16 programa = new Practica16();
		programa.inicio();
	}
	
	public void inicio() {
		int[][]A= {{1,2,3,4},{1,2,4,3},{3,4,2,1},};
		int[][]V= new int [A[0].length][A.length];
		
		for (int i=0;i<V.length;i++) {
			for (int j=0;j<A.length;j++) {
				V[i][j]=A[j][i];
				
			}
	}

	System.out.println("Matriz original: ");	
	for (int i=0;i<A.length;i++) {
		for(int j=0;j<A[i].length;j++) {
			System.out.print(A[i][j]);
		}
		System.out.println();
			
		}
		System.out.println();
		
		System.out.println("Matriz transpuesta: ");
		for (int i=0;i<V.length;i++) {
			for(int j=0;j<V[i].length;j++) {
				System.out.print(V[i][j]);
			
			}
			System.out.println();
		}
			
	}
}

	