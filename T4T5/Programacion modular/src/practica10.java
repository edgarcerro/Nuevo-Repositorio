
public class practica10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
practica10 programa = new practica10();
programa.inici();
	}
	public void inici() {
		int i = 10;
		System.out.println("Abans de cridar el metode \"i\" val " + i);
		modificarparametre(i);
		System.out.println("Despres de cridar el metode \"i\" val " +i);
	}
	public void modificarparametre(int a) {
		a=0;
		System.out.println("Heu modificat el valor a"+a);
	
	}

}
