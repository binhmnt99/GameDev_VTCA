import java.util.Scanner;

/**
 * Bai 3
 */

/**
 * @author Mai Nguyen Thanh Binh
 *K20.PF_01
 */
public class ChiaHetCho7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n;
		try (Scanner input = new Scanner(System.in)) {
			do {
				System.out.print("M = ");
				m = input.nextInt();
				System.out.print("N = ");
				n = input.nextInt();

			} while (m < 1 || n < 1);
			
			int min, max;
			
			if (m < n) {
				min = m;
				max = n;
			} else {
				min = n;
				max = m;
			}
			
			if (max < 7) {
				System.out.println(String.format("Day so trong khoang [%d,%d] khong co so chia het cho 7.", min, max));
			} else {
				System.out.print(String.format("Day so trong khoang [%d,%d] chia het cho 7 : ", min, max));
				for (int i = min; i <= max; i++) {
					if (i % 7 == 0) {
						System.out.print(i + " ");
					}
				}
				System.out.println();
			}
		}		
	}

}
