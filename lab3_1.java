package wip_lab;


	import java.util.Scanner;
	class Person {
	    private String firstName;
	    private String lastName;
	    private char gender;
	    
	    public Person() {
	    
	    }

	    public Person(String firstName, String lastName, char gender) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.gender = gender;
	    }

	  
	    public String getFirstName() {
	        return firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public char getGender() {
	        return gender;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    public void setGender(char gender) {
	        this.gender = gender;
	    }
	    public void display() {
	        System.out.println("Person Details:");
	        System.out.println("First Name : " + firstName);
	        System.out.println("Last Name  : " + lastName);
	        System.out.println("Gender     : " + gender);
	    }
	}

	public class lab3_1 {
	    public static void main(String[] args) {
	        Person p1 = new Person("Anil", "Raj", 'M');
	        p1.display();

	        System.out.println("\nEnter details for another person:");
	        
	        Person p2 = new Person();
	        Scanner sc = new Scanner(System.in);

	        System.out.print("First Name: ");
	        p2.setFirstName(sc.nextLine());

	        System.out.print("Last Name: ");
	        p2.setLastName(sc.nextLine());

	        System.out.print("Gender (M/F): ");
	        p2.setGender(sc.next().charAt(0));

	        System.out.println();
	        p2.display();
	        sc.close();
	    }
	}

