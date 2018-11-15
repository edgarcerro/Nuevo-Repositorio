
public class practica_11ymedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayA = { 10, 20, 30, 40, 50 };
		int[] arrayB = { 60, 70, 80, 90, 100 };

		arrayA = arrayB;
		arrayB[2] = 60;
		System.out.println(arrayA[2]);
		arrayA[4] = 70;
		System.out.println(arrayB[4]);
	}

}
