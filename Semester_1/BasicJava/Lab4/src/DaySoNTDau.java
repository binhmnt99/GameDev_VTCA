import java.util.Scanner;

/**
 * Bai 7
 */

/**
 * @author Mai Nguyen Thanh Binh
 *K20.PF_01
 */
public class DaySoNTDau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i = 2;
		int t = 0;
		try (Scanner input = new Scanner(System.in)) {
			do {
				System.out.print("Nhap N: ");
				n = input.nextInt();

			} while (n < 1);

			System.out.println(String.format("Day %d so nguyen to dau tien:", n));
			while (t < n) {
				if (laSoNguyenTo(i) == true) {
					System.out.print(i + " ");
					t++;
				}
				i++;
			}
		}
	}

	public static boolean laSoNguyenTo(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
