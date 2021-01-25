import java.util.Scanner;

/**
 * Bai 4
 */

/**
 * @author Mai Nguyen Thanh Binh
 *K20.PF_01
 */
public class SoThichCaNhan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		try (Scanner input = new Scanner(System.in)) {
			do {
				showMenu();
				choice = input.nextInt();
				if (choice < 1 || choice > 5) {
					System.out.println("Ban da nhap sai.");
					System.out.println("==================");
				} else {
					choiceMenu(choice);
				}

			} while (choice < 1 || choice > 5);
		}
	}
	
	public static void showMenu() {
		System.out.println(" SO THICH CA NHAN ");
		System.out.println("==================");
		System.out.println("1. Doc sach");
		System.out.println("2. Nghe nhac");
		System.out.println("3. Choi the thao");
		System.out.println("4. May tinh");
		System.out.println("5. Thoat");
		System.out.println("==================");
		System.out.print("Chon: ");
	}
	
	public static void choiceMenu(int n) {
		switch (n) {
		case 1:
			System.out.println("Ban thich doc sach");
			break;
		case 2:
			System.out.println("Ban thich nghe nhac");
			break;
		case 3:
			System.out.println("Ban thich choi the thao");
			break;
		case 4:
			System.out.println("Ban thich ngoi may tinh");
			break;
		case 5:
			System.out.println("Hen gap lai!");
			break;
		}
	}
}
