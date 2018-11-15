
public class Secuencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int serieA = 0;
		int serieB = 4;

		for (; serieA < 100 && serieB < 100;) {
			serieA += 1;
			System.out.print(serieA + " ");
			serieB += 1;
			System.out.print(serieB + " ");
		}
	}
}