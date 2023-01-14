package M.chat;

public class User {

	private String lastName;
	private String firstName;
	private String fullName;
	private String hashPassword;
	private String gender;
	private String dateOfBirth;
	
	public User(String lastName, String firstName, String fullName, String hashPassword, 
			String gender, String dateOfBirth) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.fullName = fullName;
		this.hashPassword = hashPassword;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}
	
	public User() {
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getHashPassword() {
		return hashPassword;
	}

	public void setHashPassword(String hashPassword) {
		this.hashPassword = hashPassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
