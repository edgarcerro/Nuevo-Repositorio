public class ejemplo {

	public static void main(String[] args) {
		ejemplo programa = new ejemplo();
		programa.inici();

	}
	public void inici() {
		int i =10;
		System.out.println("Abans de cridar el metode \"i\" val "+i);
		ejemplo(i);
		System.out.println("Despres de cridar el metode \"i\" val " +i);
	}
	//tiene un unico parametro de entrada de tipo entero
	public void ejemplo(int a) {
		//ahora hay una variable a declarada
		// su valor depende de como se ha invocado el metodo
		 a=0;
		 System.out.println("Heu modificat el valor a " + a);
	}
}