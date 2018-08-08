package view;

import java.util.ArrayList;

import inputdata.Input;
import entity.Student;

public class View {
	Input input = new Input();
	public void menu(){
			System.out.print("He thong quan ly ho so hoc sinh: ");
			System.out.print("\nChon 1 de nhap thong tin hoc sinh : ");
			System.out.print("\nChon 2 de tim kiem hoc sinh: ");
			System.out.print("\nChon 3 de ket thuc chuong trinh: ");
	}
	public void hienThi(Student student){
		System.out.print("\nTen: "+student.getHoTen());
		System.out.print("\nTuoi: "+student.getTuoi());
		System.out.print("\nNam sinh: "+student.getNamSinh());
		System.out.print("\nSo nha: "+student.getCountry().getSoNha());
		System.out.print("\nNgo ngach: "+student.getCountry().getNgoNgach());
		System.out.print("\nDuong: "+student.getCountry().getDuong());
		System.out.print("\nPhuong: "+student.getCountry().getPhuong());
		System.out.print("\nQuan: "+student.getCountry().getQuan());
		System.out.print("\nThanh pho: "+student.getCountry().getThanhPho());
	}
	public void hienThiAll(ArrayList<Student> arrStudent){
		for(Student student : arrStudent){
			hienThi(student);
		}
	}
    public String timKiem(){
    	String search;
    	System.out.print("Nhap nam sinh: ");
    	search = input.inputStr(); 
		return search;
    	
    }
}
