package jdbc.member;

public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String email;
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	public MemberVO(String id, String password, String name, String email) {
		super();
		setId(id); //this.id = id;
		setPassword(password); //this.password = password;
		setName(name); //this.name = name;
		setEmail(email); //this.email = email;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}
