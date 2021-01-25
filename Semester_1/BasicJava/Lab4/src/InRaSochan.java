import java.util.Scanner;

/**
 * Bai 1.1
 */

/**
 * @author Mai Nguyen Thanh Binh
 *K20.PF_01
 */
public class InRaSochan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		try (Scanner input = new Scanner(System.in)) {
			do {
				System.out.print("Nhap N: ");
				n = input.nextInt();
			} while (n < 1);
		}
		System.out.print(String.format("Day so chan den %d: ", n));
		for (int i = 1; i <= n ; i++) {
			if (i % 2 == 0) {				
				System.out.print(i + " ");
			}
		}
	}
}
