import java.util.Scanner;
public class practica13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Quieres el numero maximo *1* o el minimo *2*");
		int opcion;int[]valores= {10,2,4,5,8,6,0,8,7};
		int i,max,min;min=max=valores[0];
		opcion=sc.nextInt();
		
switch(opcion) {
case 1:
	for(i=0;i<valores.length;i++) {
	if(max<valores[i]) {
		max=valores[i];
		
	}
}
System.out.println("El numero máximo es "+max);
break;

case 2:
for(i=0;i<valores.length;i++) {
	if(min>valores[i]) {
		min=valores[i];
	}
}
System.out.println("El numero mínimo es "+min);
break;

	}

System.out.println("");

int promedio=0;
for(int k=0;k<valores.length;k++) {
	promedio+=valores[k];
}
promedio=promedio/valores.length;
System.out.println("La media es "+promedio);

System.out.println("");

for(int j=0;j<valores.length;j++) {
	if(valores[j]<5) {
		
		System.out.println(valores[j]+"=Suspendido");
}
	if(valores[j]==5) {
		System.out.println(valores[j]+"=Suficiente");
	}		
	if(valores[j]==6) {
			System.out.println(valores[j]+"=Bien");
	}
	if(valores[j]==7) {
		System.out.println(valores[j]+"=Notable");
	}
	if(valores[j]==8) {
		System.out.println(valores[j]+"=Notable alto");
}
	if(valores[j]>8) {
		System.out.println(valores[j]+"=Sobresaliente");
}
}
System.out.println(" ");

System.out.println("Escribe *1* Enero *2* Febrero *3* Marzo...");

int opcion2=sc.nextInt();

switch(opcion2) {

case 1:
	System.out.println("Enero tiene 31 dias");
	break;
case 2:
	System.out.println("Febrero tiene 28 dias");
	break;
case 3:
	System.out.println("Marzo tiene 31 dias");
	break;
case 4:
	System.out.println("Abri tiene 30 dias");
	break;
case 5:
	System.out.println("Mayo tiene 31 dias");
	break;
case 6:
	System.out.println("Junio tiene 30 dias");
	break;
case 7:
	System.out.println("Julio tiene 31 dias");
	break;
case 8:
	System.out.println("Agosto tiene 30 dias");
	break;
case 9:
	System.out.println("Septiembre tiene 31 dias");
	break;
case 10:
	System.out.println("Octubre tiene 30 dias");
	break;
case 11:
	System.out.println("Noviembre tiene 31 dias");
	break;
case 12:
	System.out.println("Diciembre tiene 30 dias");
	break;
}
System.out.println("Que valor quieres buscar en el array,*0**1**2*...");
int buscar=sc.nextInt();
for(int j=0;j<valores.length;j++) {
	if(buscar==j) {
		System.out.println(valores[j]);
	}
}
sc.close();
}	
}
