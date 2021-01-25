
//Mai Nguyen Thanh Binh K20.PF_01

import java.util.Scanner;

public class Bai1 {
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
			
			System.out.println("======================================");
			System.out.println("Danh sach cac ung vien da nhap");
			System.out.println("======================================");
			System.out.println("***Ung vien so 1:");
			System.out.println("+ Ho ten: " + name1);
			System.out.println("+ Nam sinh: " + date1);
			System.out.println("+ Gioi tinh: " + gender1);
			System.out.println("+ Chieu cao: " + height1);
			System.out.println("+ Can nang: " + weight1);
			System.out.println("+ Que quan: " + country1);
			System.out.println("+ Chyen nganh: " + specialized1);
			System.out.println("+ Diem TB: " + mark1);
			System.out.println("***Ung vien so 2:");
			System.out.println("+ Ho ten: " + name2);
			System.out.println("+ Nam sinh: " + date2);
			System.out.println("+ Gioi tinh: " + gender2);
			System.out.println("+ Chieu cao: " + height2);
			System.out.println("+ Can nang: " + weight2);
			System.out.println("+ Que quan: " + country2);
			System.out.println("+ Chyen nganh: " + specialized2);
			System.out.println("+ Diem TB: " + mark2);
			System.out.println("***Ung vien so 3:");
			System.out.println("+ Ho ten: " + name3);
			System.out.println("+ Nam sinh: " + date3);
			System.out.println("+ Gioi tinh: " + gender3);
			System.out.println("+ Chieu cao: " + height3);
			System.out.println("+ Can nang: " + weight3);
			System.out.println("+ Que quan: " + country3);
			System.out.println("+ Chyen nganh: " + specialized3);
			System.out.println("+ Diem TB: " + mark3);
		}
	}
}
