
public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4;
		int cont = 0;

		for (int i = 1; i <= num; i++) {
			System.out.print(" ");
			for (int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < num - i; k++) {
				System.out.print(k);
			}
			for (int l = cont - 2; l >= i; l--) {
				System.out.print(l);
			}
			System.out.println("");
		}

	}
}