import java.util.Scanner;
public class Practica15 {

  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cadena1 = {1,2,3};int[] cadena2 = {1,4,3}; 
        Scanner sc=new Scanner(System.in);
      boolean soniguales = false;
		
	if (cadena1.length == cadena2.length) {
		for(int i = 0;i<cadena1.length;i++) {
			if(cadena1[i]==cadena2[i]) {
				soniguales=true;
				System.out.println(soniguales);
			}else {
				soniguales=false;
				System.out.println(soniguales);
			
			}
		}	
		}
}
}