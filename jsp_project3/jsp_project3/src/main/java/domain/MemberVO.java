package domain;

public class MemberVO {
	private String name;
	private String id;
	private String password;
	private String email;
	private int age;
	private String reg_date;
	private String last_login;

	public MemberVO() {
	}

	// login : id, password
	public MemberVO(String id, String password) {
		this.id = id;
		this.password = password;
	}

	// join : name, id, password, email, age
	public MemberVO(String name, String id, String password, String email, int age) {
		this(id, password);
		this.name = name;
		this.email = email;
		this.age = age;
	}

	// list : id, email, age, reg_date, last_login
	public MemberVO(String name,String id, String email, int age, String last_login) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.age = age;
	}

	// modify : name, password, email, age
	public MemberVO(String name, String password, String email, int age) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", id=" + id + ", password=" + password + ", email=" + email + ", age=" + age
				+ ", reg_date=" + reg_date + ", last_login=" + last_login + "]";
	}

	
}
