package controller;

import java.util.ArrayList;

import model.StudentManagerment;
import view.View;
import inputdata.Input;
import entity.Student;

public class Program {

	public static void main(String[] args) {
		int cs;
		String checkOut;
		boolean flag = true;
		ArrayList<Student> arrS = new ArrayList<Student>();
		View view = new View();
		Input input = new Input();
		StudentManagerment sM = new StudentManagerment();
		do {
			view.menu();
			System.out.print("\n Ban chon: ");
			cs = input.inputInt();
			switch (cs) {
			case 1: {
					arrS = sM.nhapAll();
				break;
			}
			case 2: {
				do{
					String namSinh;
					namSinh = view.timKiem();
					ArrayList<Student> arrTemp = new ArrayList<Student>();
					arrTemp = sM.timKiemHS(namSinh, arrS);
					view.hienThiAll(arrTemp);
					System.out.print("\nSo hoc sinh co que o ha noi va sinh nam "+namSinh+" = "+sM.getCount());
					System.out.print("\nBan muon tiep tuc chon y/n: ");
					checkOut = input.inputStr();
				}while(checkOut.equalsIgnoreCase("y"));
				break;
			}
			case 3: {
				flag = false;
				System.out.print("\n Ket thuc ct!!!: ");
				break;
			}
			default: {
				System.out
						.print("\n Ban phai nhap trong khoang 1-3 moi nhap lai: ");
				break;
			}
			}
		} while (flag);
	}
}
