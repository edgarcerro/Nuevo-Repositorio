import java.util.Scanner;
 
public class Ejercicio_4 {
 
    private int []dias = new int[360];
   
    private final static String []meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
   
    private final static int kTOTAL = 1000;
    private int dia = 0;
    private int semana = 0;
    private int mes = 0;
    private int opcion = 0;
    private Scanner teclado = new Scanner(System.in);
    private int contador = 0;
 
    public static void main(String[] args) {
       
        Ejercicio_4 programa = new Ejercicio_4();
       
        programa.inicializar();
        programa.inicio();
 
    }
 
    public void inicio() {
       
      do{
           
        System.out.println("*******************************");
        System.out.println("Introduce una opcion:");
        System.out.println("1.Insertar temperatura");
        System.out.println("2.Media de temperaturas introducidas");
        System.out.println("3.Diferencia maxima entre la media");
        System.out.println("4.Salir");
        System.out.println("*******************************");
        System.out.println();
        System.out.print("Introduce una opcion: ");
       
        while (!teclado.hasNextInt()) {
 
                System.out.print("Solo se admiten numeros enteros");
                teclado.next();
        }
 
        opcion = teclado.nextInt();
   
                switch(opcion) {
               
                    case 1: registro();
                    break;
                   
                    case 2: tempMedia();
                    break;
                   
                    case 3: difMaxima();
                    break;
                   
                    case 4: cerrar();
                    break;
                   
                }
       
        }while(opcion < 1 || opcion > 4);
 
    }
   
    public void cerrar() {
       
        teclado.close();
       
    }
   
    public void inicializar() {
       
        for(int i = 0; i < dias.length; i++) {
           
            dias[i] = kTOTAL;
           
        }
       
    }
 
   
    public void registro() {
       
        int fin = 7;
     
       
        	semana++;
            
        	for(int inicio = 0; inicio < fin; inicio++)
            {
            	incrementarFecha();
            	mostrarFecha();
                   
                while (!teclado.hasNextInt()) {
   
                        System.out.print("Solo se admiten numeros enteros: ");
                        teclado.next();
                }
   
                dias[contador] = teclado.nextInt();
                
              
                contador++;
                
            }
           
            inicio();  
    }
    
    public void incrementarFecha(){
    	
    	dia++;
        
        if(dia == 31){
            dia = 1;
            mes++;
        }
    }
    
    public void mostrarFecha(){
    	
    	 System.out.println("Dia: " + (dia)  + " Mes: " + meses[mes] + ": " + "Semana: " + (semana));
    }
   
    public void tempMedia() {
       
        int rellenadas = 0;
        int suma = 0;
        float media=0.0F;
       
        if(dias[rellenadas] != 1000) {
       
            while(dias[rellenadas] != 1000 ) {
               
                suma = dias[rellenadas] + suma;
                rellenadas++;
            }
           
            media = suma/rellenadas;
           
            mostrarFecha();
            System.out.println("La media es: " + media + " grado(s)");
   
            inicio();
           
        }else {
           
            inicio();
           
        }
       
    }
    
   
    public void difMaxima() {
    	
    	int maxima = dias[0];
    	int minima = dias[0];
    	boolean salir=false;
    	
    	for (int i = 0; i < dias.length && salir==false; i++) {
			if(dias[i]!=1000)
			{
				if (dias[i] > maxima) {
					maxima = dias[i];
	            }
		
				if (dias[i] < minima) {
					minima = dias[i];
	            }
			}
			else
			{
				salir=true;
			}
			
		}
    	
    	System.out.println("La maxima es: " + maxima);
    	System.out.println("La minima es: " + minima);
        System.out.println("La diferencia maxima es de " + (maxima-minima) + " grados");
        inicio();
          
       
   }
 
}
	
	
	
	
	
