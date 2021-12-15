package ServletData;

public class CreateAccountPOJO {

	
	private String firstName;
	private String mname;
	private String lastname;
	private String DOB;
	private String email;
	private String mobno;
	private String gender;
	private String add;
	private String country;
	private String ssn;
	
	
	public CreateAccountPOJO() {
		super();
	}
	
	public CreateAccountPOJO(String firstName, String mname, String lastname, String dOB, String email, String mobno,
			String gender, String add, String country, String ssn) {
		super();
		this.firstName = firstName;
		this.mname = mname;
		this.lastname = lastname;
		DOB = dOB;
		this.email = email;
		this.mobno = mobno;
		this.gender = gender;
		this.add = add;
		this.country = country;
		this.ssn = ssn;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
}
