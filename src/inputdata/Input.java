package inputdata;

import java.util.Scanner;

public class Input {

	public int inputInt() {
		int number = 0;
		boolean flag=true;
		do {
			Scanner scInt = new Scanner(System.in);
			try {
				number = scInt.nextInt();
				flag = false;
			} catch (Exception e) {
				System.out.print("Nhap sai kieu so nguyen, moi nhap lai: ");
			}
		} while (flag);
		return number;
	}

	public String inputStr() {
		String str = null;
		boolean flag = true;
		do {
			Scanner scStr = new Scanner(System.in);
			try {
				str = scStr.nextLine();
				flag = false;
			} catch (Exception e) {
				System.out.print("Nhap sai kieu chuoi, moi nhap lai: ");
			}
		} while (flag);
		return str;
	}

}
