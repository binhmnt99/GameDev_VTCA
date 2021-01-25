import java.util.Scanner;

/**
 * Bai 1.2
 */

/**
 * @author Mai Nguyen Thanh Binh
 *K20.PF_01
 */
public class InDaySoNguyenTo {

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
			} while (n < 2);
		}
		
		System.out.print(String.format("Day so nguyen to den %d: ", n));
		for (int i = 2; i <= n; i++) {
			if (laSoNguyenTo(i) == true) {
				System.out.print(i + " ");
			}
		}
		
	}

	public static boolean laSoNguyenTo(int n) {
		if(n < 2) {
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
