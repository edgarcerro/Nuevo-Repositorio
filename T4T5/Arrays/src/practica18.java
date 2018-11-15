import java.util.Scanner;//Introduce una frase y te lo convierte en mayusculas

public class practica18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String frase = "";
char letra ='\0';

Scanner imput = new Scanner(System.in);
System.out.println("Introduce una frase:");
frase=imput.nextLine();

for(int i = 0;i<=frase.length()-1;i++) {
	letra=frase.charAt(i);
	letra=Character.toUpperCase(letra);
	System.out.print(letra);
}
imput.close();
	}

}
