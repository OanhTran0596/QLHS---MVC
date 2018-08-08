package model;

import java.util.ArrayList;

import view.View;
import inputdata.Input;
import entity.Country;
import entity.Student;

public class StudentManagerment {
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	View view = new View();
	Input input = new Input();

	private Student nhapTTHS() {
		Country country = new Country();
		Student student = new Student();
		System.out.print("Nhap ho ten: ");
		student.setHoTen(input.inputStr());
		System.out.print("Nhap tuoi: ");
		student.setTuoi(input.inputInt());
		System.out.print("Nhap nam sinh: ");
		student.setNamSinh(input.inputStr());
		System.out.print("Nhap so nha: ");
		country.setSoNha(input.inputStr());
		System.out.print("Nhap ngo ngach: ");
		country.setNgoNgach(input.inputStr());
		System.out.print("Nhap duong: ");
		country.setDuong(input.inputStr());
		System.out.print("Nhap phuong: ");
		country.setPhuong(input.inputStr());
		System.out.print("Nhap quan: ");
		country.setQuan(input.inputStr());
		System.out.print("Nhap thanh pho: ");
		country.setThanhPho(input.inputStr());
		student.setCountry(country);
		return student;
	}

	public ArrayList<Student> nhapAll() {
		String checkOut;
		ArrayList<Student> arr = new ArrayList<Student>();
		do {
			arr.add(nhapTTHS());
			System.out.print("\nBan muon tiep tuc chon y/n: ");
			checkOut = input.inputStr();
		} while (checkOut.equalsIgnoreCase("y"));

		return arr;
	}

	public ArrayList<Student> timKiemHS(String namSinh, ArrayList<Student> arrS) {
		int count = 0;
		ArrayList<Student> arrTemp = new ArrayList<Student>();
		for (Student student : arrS) {
			if (student.getNamSinh().equalsIgnoreCase(namSinh)) {
				arrTemp.add(student);
				if (student.getCountry().getThanhPho()
						.equalsIgnoreCase("Ha Noi")) {
					count++;
				}
			}
		}
		this.setCount(count);

		return arrTemp;
	}
}
