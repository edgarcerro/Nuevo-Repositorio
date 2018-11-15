import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el numero de filas: ");
        int filas = sc.nextInt();
        sc.close();
         
        System.out.println();
        for(int h = 1; h<=filas; h++){
            
            for(int espacios = 1; espacios<=filas-h; espacios++){
                System.out.print(" ");
            }
             
           
            for(int asteriscos=1; asteriscos<=(h*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
         
        
    }
}