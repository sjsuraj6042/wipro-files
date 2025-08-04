package wip_lab;
import java.util.Scanner;

 class Lab7 {

	 String fisrtName;
	String lastName;
	String gender;
	String mobNum;

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String acceptPhoneNumber(String num) {
		return num;
	}

	public String display() {
		return "Person [fisrtName=" + fisrtName + ", lastName=" + lastName + ", gender=" + gender + ", mobNum=" + mobNum
				+ "]";
	}
}
public class lab7mains {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Lab7 p1 = new Lab7();  // updated class name

		p1.setFisrtName("Suraj");
		p1.setLastName("Panda");

		System.out.println("Person Details");
		System.out.println("-----------------");

		System.out.println("FirstName: " + p1.getFisrtName());
		System.out.println("LastName: " + p1.getLastName());
		System.out.println("Gender: " + p1.getGender());

		System.out.println("Enter mobile number:");
		String acceptedNumber = sc.next();
		System.out.println("Phone number: " + acceptedNumber);

	}
}

