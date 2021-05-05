package java_campD4_HW3;

import java.util.Date;

public class User extends Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String nationaltyNumber;
	private Date birthDate;
	public User(int id, String firstName, String lastName, String nationaltyNumber, Date birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaltyNumber = nationaltyNumber;
		this.birthDate = birthDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getNationaltyNumber() {
		return nationaltyNumber;
	}
	public void setNationaltyNumber(String nationaltyNumber) {
		this.nationaltyNumber = nationaltyNumber;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
