import java.util.Scanner;

public class ejborja1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numeroarray=0;
int [] primerarray=null;
int [] segundoarray=null;
int aux=0;
int numerobuscar=0;
int n=0;

Scanner sc =new Scanner(System.in);

System.out.println("Introduce la largaria del array");

numeroarray = sc.nextInt();
primerarray = new int [numeroarray];
System.out.println("Ahora voy a rellenar el array con numeros aleatorios entre ");
System.out.println("");

for (int i=0;i<primerarray.length;i++){
	primerarray[i]=(int) (Math.random()*300)+1;
	System.out.println(primerarray[i]+" ");
}
 System.out.println("");
System.out.println("Que numero quieres buscar; ");
numerobuscar=sc.nextInt();

for (int j=0;j<primerarray.length;j++) {
	if (primerarray[j]%10==numerobuscar) {
		aux++;
	}
}

segundoarray=new int[aux];

for(int l=0;l<primerarray.length;l++) {
	if (primerarray[l]%10==numerobuscar) {
		segundoarray[n]=primerarray[l];
		n++;
	}
}

System.out.println("Ahora te voy a mostrar un array con los numeros encontrados");
System.out.println("");
for (int k=0;k<primerarray.length;k++) {
	System.out.println(segundoarray[k]+ " ");
	
}

sc.close();
	}

}
