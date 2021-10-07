/*Studymanagement app moet studenten gegevens kunnen INVOEREN en BEKIJKEM.
  Het is een studenten registratie, data moet nl. worden opgeslagen en gelezen uit array

  Person.java is een parent class
  Student.java is een child class
  Study_management.java is de main methodclass
*/

public class Person {
	
	protected String firstname;
	protected String lastname;
	protected String birthdate;
	protected String gender;
	protected String ethnicity;
	protected String nationality;
	protected String adress;
	
	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Person() {
	}


}
