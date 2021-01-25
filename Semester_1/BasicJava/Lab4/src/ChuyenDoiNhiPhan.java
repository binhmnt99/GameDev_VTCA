import java.util.Scanner;

/**
 * Bai 8
 */

/**
 * @author Mai Nguyen Thanh Binh
 *K20.PF_01
 */
public class ChuyenDoiNhiPhan {

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
				
				System.out.print(String.format("So %d chuyen thanh so Nhi Phan: %s", n, chuyenSangBinary(n)));
			} while (n <= 0);
		}		
	}

	public static String chuyenSangBinary(int n) {
		String bin = "";
		while (n > 0) {
			bin = ((n % 2) == 0 ? "0" : "1") + bin;
			n = n/2;
		}
		return bin;
	}
}
