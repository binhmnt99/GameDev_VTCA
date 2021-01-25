import java.util.Scanner;

/**
 * Bai 2
 */

/**
 * @author Mai Nguyen Thanh Binh
 *K20.PF_01
 */
public class KiemTrakyTu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		try (Scanner input = new Scanner(System.in)) {
			do {
				System.out.print("Nhap 1 ky tu: ");
				c = input.next().charAt(0);
				if (65 <= c && c <= 90 || 97 <= c && c <= 122) {
					System.out.println(String.format("%c la chu cai.", c));
				} else if (48 <= c && c <= 57) {
					System.out.println(String.format("%c la chu so.", c));
				} else {
					System.out.println(String.format("%c la ky tu dac biet.", c));
				}
			} while (c == ' ');
		}
	}
}
