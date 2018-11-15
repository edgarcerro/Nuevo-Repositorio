import java.util.Scanner;//Fail

public class practica22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String palabra="";
String[] arrayPalabras = new String[3];
int resultadoComparacion=0;
String auxPalabra="";

Scanner input = new Scanner(System.in);

System.out.println("Introduce 3 palabras");
for (int i=0;i<arrayPalabras.length-1;i++ ) {
	palabra=input.nextLine();
	arrayPalabras[i]=palabra;
}
	for (int i=0;i<arrayPalabras.length;i++ ) {
		for (int j=i;j<arrayPalabras.length-1;j++ ) {
		resultadoComparacion = arrayPalabras[i].compareTo(arrayPalabras[j+1]);
		if(resultadoComparacion>0) {
			auxPalabra= arrayPalabras[i];
			arrayPalabras[i]=arrayPalabras[j+1];
			arrayPalabras[j+1]=auxPalabra;
		}
	}
	
	System.out.print(arrayPalabras[i]+" ");
}
input.close();









	}

}
