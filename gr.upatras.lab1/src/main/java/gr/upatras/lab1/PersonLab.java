package gr.upatras.lab1;

/**
 * This is a person class
 * @author up1066579
 *
 */
public class PersonLab {
	
	/**
	 * This is the first name
	 */
	private String firstName;
	
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	/**
	 * This will set the person's name
	 * @param firstName is the 1st name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
