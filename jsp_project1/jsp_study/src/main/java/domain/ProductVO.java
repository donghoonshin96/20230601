package domain;

public class ProductVO {
	/*
	 * Create table product( Pno int not null auto_increment, Pname varchar(45) not
	 * null, Price int not null, Regdate datetime default now(), Madeby varchar(45),
	 * Primary key(pno));
	 */

	private int pno;
	private String pname;
	private int price;
	private String regdate;
	private String madeby;

	public ProductVO() {
	}

	// 상품등록 pname, price, madeby
	public ProductVO(String pname, int price, String madeby) {
		this.pname = pname;
		this.price = price;
		this.madeby = madeby;
	}

	// 상품리스트 pno, pname, regdate
	public ProductVO(int pno, String pname, String regdate) {
		this.pno = pno;
		this.pname = pname;
		this.regdate = regdate;
	}

	// 상품 수정 pno, pname, price, madeby
	public ProductVO(int pno, String pname, int price, String madeby) {
		this(pname, price, madeby);
		this.pno = pno;
	}

	// 상품 상세페이지 전부
	public ProductVO(int pno, String pname, int price, String regdate, String madeby) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.regdate = regdate;
		this.madeby = madeby;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	@Override
	public String toString() {
		return "ProductVO [pno=" + pno + ", pname=" + pname + ", price=" + price + ", regdate=" + regdate + ", madeby="
				+ madeby + "]";
	}

}
