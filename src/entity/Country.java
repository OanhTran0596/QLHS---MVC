package entity;

public class Country {
	private String soNha;
	private String ngoNgach;
	private String duong;
	private String phuong;
	private String quan;
	private String thanhPho;
	public String getSoNha() {
		return soNha;
	}
	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}
	public String getNgoNgach() {
		return ngoNgach;
	}
	public void setNgoNgach(String ngoNgach) {
		this.ngoNgach = ngoNgach;
	}
	public String getDuong() {
		return duong;
	}
	public void setDuong(String duong) {
		this.duong = duong;
	}
	public String getPhuong() {
		return phuong;
	}
	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}
	public String getQuan() {
		return quan;
	}
	public void setQuan(String quan) {
		this.quan = quan;
	}
	public String getThanhPho() {
		return thanhPho;
	}
	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}
	public Country() {
		super();
	}
	public Country(String soNha, String ngoNgach, String duong, String phuong,
			String quan, String thanhPho) {
		super();
		this.soNha = soNha;
		this.ngoNgach = ngoNgach;
		this.duong = duong;
		this.phuong = phuong;
		this.quan = quan;
		this.thanhPho = thanhPho;
	}
	

}
