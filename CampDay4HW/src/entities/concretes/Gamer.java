package entities.concretes;

public class Gamer {
	private String tcNo;
	private String firstName;
	private String lastName;
	private String birthDay;
	public Gamer() {
		super();
	}
	
	public Gamer(String tcNo, String firstName, String lastName, String birthDay) {
		super();
		this.tcNo = tcNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
	
	
	
	
}
