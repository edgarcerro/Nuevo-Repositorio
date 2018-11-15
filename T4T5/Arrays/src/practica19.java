import java.util.Scanner;//Introduce 5 textos y te dice cuantos carácteres tiene cada uno.

public class practica19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner (System.in);
String palabra="";
String Array[]=new String[5];
System.out.println("Dime palabra");
for (int i=0;i<Array.length;i++) {
	
	palabra=teclado.next();
	Array[i]=palabra;
}
System.out.println();
for (int i=0;i < Array.length;i++) {
	System.out.println("Longitud: "+Array[i].length());
}
teclado.close();
	}

}
