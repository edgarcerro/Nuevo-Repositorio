import java.util.Scanner;

public class Actividad1 {

	private static Scanner scan;
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		
			scan = new Scanner(System.in);

			int num = scan.nextInt();
			String s = String.valueOf(num);
			double suma = 0;
			for (int i = 0; i < s.length(); i++) {
				int digito = Integer.parseInt(s.charAt(i) + "");
				suma = suma + Math.pow(digito, 3);
			}
			System.out.println(suma);
		}
	}


