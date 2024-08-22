package in.sonu.main.entity;

public class User {
	private int id;
	private String fullname;
	private String email;
	private String password;
	private String check;
	private String Image;

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		this.Image = image;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + ", check="
				+ check + ", image=" + Image + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

}
