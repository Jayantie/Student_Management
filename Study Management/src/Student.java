import java.util.ArrayList;

public class Student extends Person {

	protected String cohort;
	protected String student_number;
	protected String email;
	protected String specialization;
	
	
	
	public String getCohort() {
		return cohort;
	}

	public void setCohort(String cohort) {
		this.cohort = cohort;
	}

	public String getStudent_number() {
		return student_number;
	}

	public void setStudent_number(String student_number) {
		this.student_number = student_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Student() {
	}

	
}
