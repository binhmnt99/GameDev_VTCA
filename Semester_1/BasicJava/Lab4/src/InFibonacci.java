import java.util.Scanner;

/**
 * Bai 6
 */

/**
 * @author Mai Nguyen Thanh Binh
 *K20.PF_01
 */
public class InFibonacci {

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
			} while (n <= 0 );
		}
		
		System.out.print(String.format("Day %d so Fibonacci dau tien: ", n));
		for (int i = 1; i <= n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int n) {
		int f0 = 0, f1 = 1, fn = 1;
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			for (int i = 2; i < n; i++) {
				f0 = f1;
				f1 = fn;
				fn = f0 + f1;
			}
		}
		return fn;
	}
}
