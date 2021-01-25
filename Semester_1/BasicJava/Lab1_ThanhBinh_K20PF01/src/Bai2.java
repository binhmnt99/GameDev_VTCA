import java.util.Scanner;

//Mai Nguyen Thanh Binh K20.PF_01

public class Bai2 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in)) {
					System.out.println("Chuong trinh nhap xuat thong tin ung vien");
					System.out.println("=========================================");
					System.out.println("***Moi nhap ung vien so 1:");
					System.out.print("+ Nhap ho ten:");
					String name1 = input.nextLine();
					System.out.print("+ Nhap nam sinh:");
					int date1 = input.nextInt();
					System.out.print("+ Nhap gioi tinh:");
					char gender1 = input.next().charAt(0);
					System.out.print("+ Nhap chieu cao:");
					double height1 = input.nextDouble();
					System.out.print("+ Nhap can nang:");
					int weight1 = input.nextInt();
					System.out.print("+ Nhap que quan:");
					String country1 = input.nextLine();
					country1 = input.nextLine();
					System.out.print("+ Nhap chuyen nganh:");
					String specialized1 = input.nextLine();
					System.out.print("+ Nhap diem TB:");
					double mark1 = input.nextDouble();
					System.out.println("***Moi nhap ung vien so 2:");
					System.out.print("+ Nhap ho ten:");
					String name2 = input.nextLine();
					name2 = input.nextLine();
					System.out.print("+ Nhap nam sinh:");
					int date2 = input.nextInt();
					System.out.print("+ Nhap gioi tinh:");
					char gender2 = input.next().charAt(0);
					System.out.print("+ Nhap chieu cao:");
					double height2 = input.nextDouble();
					System.out.print("+ Nhap can nang:");
					int weight2 = input.nextInt();
					System.out.print("+ Nhap que quan:");
					String country2 = input.nextLine();
					country2 = input.nextLine();
					System.out.print("+ Nhap chuyen nganh:");
					String specialized2 = input.nextLine();
					System.out.print("+ Nhap diem TB:");
					double mark2 = input.nextDouble();
					System.out.println("***Moi nhap ung vien so 3:");
					System.out.print("+ Nhap ho ten:");
					String name3 = input.nextLine();
					name3 = input.nextLine();
					System.out.print("+ Nhap nam sinh:");
					int date3 = input.nextInt();
					System.out.print("+ Nhap gioi tinh:");
					char gender3 = input.next().charAt(0);
					System.out.print("+ Nhap chieu cao:");
					double height3 = input.nextDouble();
					System.out.print("+ Nhap can nang:");
					int weight3 = input.nextInt();
					System.out.print("+ Nhap que quan:");
					String country3 = input.nextLine();
					country3 = input.nextLine();
					System.out.print("+ Nhap chuyen nganh:");
					String specialized3 = input.nextLine();
					System.out.print("+ Nhap diem TB:");
					double mark3 = input.nextDouble();
					
					System.out.println(String.format("%s%10s%25s%12s%12s%12s%12s%22s%15s", "STT", "Ho ten", "Nam sinh",
							"Gioi tinh", "Chieu cao", "Can Nang", "Que quan", "Chuyen nganh", "Diem TB"));
					System.out.println("==============================================================================="
							+ "============================================");
					System.out.println(String.format("%-7d%-23s%-11d%-12c%-13.2f%-12d%-18s%-20s%.1f", 1, name1, date1,
							gender1, height1, weight1, country1, specialized1, mark1));
					System.out.println(String.format("%-7d%-23s%-11d%-12c%-13.2f%-12d%-18s%-20s%.1f", 2, name2, date2,
							gender2, height2, weight2, country2, specialized2, mark2));
					System.out.println(String.format("%-7d%-23s%-11d%-12c%-13.2f%-12d%-18s%-20s%.1f", 3, name3, date3,
							gender3, height3, weight3, country3, specialized3, mark3));
				}
	}
}
