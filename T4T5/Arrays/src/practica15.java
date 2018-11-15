import java.util.Scanner;//introduce el numero de filas y columnas y hace una tabla
public class practica15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][]vec;
		
		System.out.println("Introuce el número de filas");
		while (!sc.hasNextInt()) {
			System.out.println("introduceme un numero entero");
			sc.next();
		}
		int filas=sc.nextInt();
		System.out.println("Ahora introduce las columnas");
		while(!sc.hasNextInt()) {
			System.out.println("introduce un numero entero");
			sc.next();
		}
		int columnas=sc.nextInt();
		sc.close();
		
		vec=new int[filas][columnas];
		System.out.println("-------------------------");
		for(int i=0;i<vec.length;i++) {
			for(int j=0;j<vec[i].length;j++) {
			vec[i][j]=i+j;
			System.out.print(vec[i][j]+", ");
		}
		System.out.println();
		
		
		
	}
	}
}
