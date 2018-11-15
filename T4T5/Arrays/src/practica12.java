
public class practica12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 5, 4, 6, 5, 8, 7, 9, 3, 2, 15 };
		int[] B = new int[10];

		for (int i = 0; i < B.length; i++) {
			B[i] = A[i];
		}
		for (int j = 0; j < B.length; j++) {
			System.out.print(B[j] + ",");
		}

	}
}