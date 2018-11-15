import java.util.Scanner;//Escribes una frase y te la imprime del reves

public class practica17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);

String palabra;
System.out.println("Introduce una frase");
palabra=sc.nextLine();

for(int i = palabra.length()-1;i >=0; i--) {
	
	System.out.print(palabra.charAt(i));
}
sc.close();
	}

}
