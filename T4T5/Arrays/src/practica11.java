import java.util.Scanner;//Introduce unas notas y las filtra en susp. aprov. not. sobre.

public class practica11 {
	public static final int NUM_NOTAS = 10;

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int[] notas = { 10, 10, 10, 10, 8, 6, 7, 8, 10, 6 };
		int[] descripcion = new int[4];

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 5)
				descripcion[0] += 1;
			if (notas[i] >= 5 && notas[i] < 7)
				descripcion[1] += 1;
			if (notas[i] >= 7 && notas[i] < 10)
				descripcion[2] += 1;
			if (notas[i] == 10)
				descripcion[3] += 1;
		}
		System.out.println("      Lista de notas");
		System.out.println("----------------------------");
		System.out.print("      suspendidos");
		for (int j = 0; j < descripcion[0]; j++) {
			System.out.print("*");
		}
		System.out.println("");

		System.out.print("      aprobados");
		for (int k = 0; k < descripcion[1]; k++) {
			System.out.print("*");
		}
		System.out.println("");

		System.out.print("      notables");
		for (int l = 0; l < descripcion[2]; l++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("      sobresalientes");
		for (int m = 0; m < descripcion[3]; m++) {
			System.out.print("*");
			lector.close();
		}
	}
}
