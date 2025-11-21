package Week12;
import java.util.Scanner;

class Person {
	String first_name;
	String last_name;
	String gender;
	int age;
	double weight;
	double height;
	String ethnic_group;
	String religion;
}

public class Person_Info_App {
	static Scanner userinput = new Scanner(System.in);
	
	public static void main(String[] args) {
		//create new person
		Person person1 = new Person();
		//get information from the user
		System.out.println("Enter the requested information for a person.");
		System.out.print("First Name: ");
		person1.first_name = userinput.nextLine();
		System.out.print("Last Name: ");
		person1.last_name = userinput.nextLine();
		System.out.print("Gender: ");
		person1.gender =  userinput.nextLine();
		System.out.print("Age: ");
		person1.age =  userinput.nextInt();
		userinput.nextLine();
		System.out.print("Weight (lb): ");
		person1.weight =  userinput.nextDouble();
		userinput.nextLine();
		System.out.print("Height (in): ");
		person1.height =  userinput.nextDouble();
		userinput.nextLine();
		System.out.print("Ethnic Group: ");
		person1.ethnic_group = userinput.nextLine();
		System.out.print("Religion: ");
		person1.religion = userinput.nextLine();
		//display the entered information
		System.out.println("\nHere is the information entered: \n");
		System.out.format("%-15s%-15s\n", "First Name: ", person1.first_name);
		System.out.format("%-15s%-15s\n", "Last Name: ", person1.last_name);
		System.out.format("%-15s%-15s\n", "Gender: ", person1.gender);
		System.out.format("%-15s%-15d\n", "Age: ", person1.age);
		System.out.format("%-15s%.1f lb\n", "Weight: ", person1.weight);
		System.out.format("%-15s%.1f in\n", "Height: ", person1.height);
		System.out.format("%-15s%-20s\n", "Ethnic Group: ", person1.ethnic_group);
		System.out.format("%-15s%-20s\n", "Religion: ", person1.religion);	
	}
}
