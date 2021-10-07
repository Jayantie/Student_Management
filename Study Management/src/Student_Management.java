import java.util.ArrayList;
import java.util.Scanner;

public class Student_Management {
//arraylist allstudent bewaart en weergeeft alle attributen van een person
	public static ArrayList<String> allstudent = new ArrayList<String>();
	public static ArrayList<String> studentarray = new ArrayList<String>();
	
	public Student_Management() {
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//kies optie 1 of 2		
		System.out.println("1.Gegevens invoeren");
		System.out.println("2.Gegevens bekijken");

		Student student = new Student();
		while (true){
			System.out.println("1.Gegevens invoeren");
			System.out.println("2.Gegevens bekijken");
			
			if (input.nextInt()==1) {
				
				student.setLastname(DisplayTextAndGetInput(input, "Lastname"));
				student.setFirstname(DisplayTextAndGetInput(input, "Firstname"));
				student.setBirthdate(DisplayTextAndGetInput(input, "Birthdate"));
				student.setGender(DisplayTextAndGetInput(input, "Gender"));
				student.setEthnicity(DisplayTextAndGetInput(input, "Ethnicity"));
				student.setNationality(DisplayTextAndGetInput(input, "Nationality"));
				student.setAdress(DisplayTextAndGetInput(input, "Address"));
				student.setCohort(DisplayTextAndGetInput(input, "Cohort"));
				student.setStudent_number(DisplayTextAndGetInput(input, "Student number"));
				student.setEmail(DisplayTextAndGetInput(input, "Email"));
				student.setSpecialization(DisplayTextAndGetInput(input, "Specialisatie"));
				
			
				//ik probeer alle ingevoerde gegevens te adden in array middels addall method			
				allstudent.addAll(studentarray);
				
				//FIXME
				//Als ik optie 1 kies, vraagt hij me niet student gegevens in te vullen
							
				
			} else if(input.nextInt()==2) {
							for (int i = 0; i < allstudent.size() ; i++) {
						   System.out.println(allstudent.get(i));
						
					}
			}else {
				System.out.println("Graag een keuze maken uit bovenstaande opties");
			}
		}
		
		
	}
	
//FIXME	
//hier will ik ingevoerde gegevens saven in me arraylist		
	public void SaveStudent() {
	}
	
	public static String DisplayTextAndGetInput(Scanner input, String text){
		String InputValue = "";
		
		System.out.println(text+":");
		InputValue = input.next();
		studentarray.add(InputValue);
		
		return InputValue;
		
	}

}
