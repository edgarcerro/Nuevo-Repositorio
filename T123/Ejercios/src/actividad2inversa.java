import java.util.Scanner;
 

public class actividad2inversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Introduzca numero de filas: ");
	        int numFilas = sc.nextInt();
	        sc.close();
	        System.out.println();
	        for(int numBlancos=0, numAsteriscos=(numFilas*2)-1 ;numAsteriscos>0; numBlancos++, numAsteriscos-=2){
	           
	            for(int i=0;i<numBlancos;i++){
	                System.out.print(" ");
	            }
	            
	            for(int j=numAsteriscos;j>0;j--){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }   
	}