package service;

import java.util.Scanner;
import model.Employee;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter your First Name:");
String firstName = sc.nextLine();

System.out.println("Enter your Last Name:");
String lastName = sc.nextLine();

Employee employee = new Employee(firstName, lastName);  
// Parameterized constructor to pass firstName & lastName

System.out.println("Determine the department from the following option:");
System.out.println("1.Technical \n2.Admin \n3.HumanResource \n4.Legal");

int option = sc.nextInt();

CredentialService cs = new CredentialService();
String generatedEmail;
char[] generatedPassword;

if(option==1) {
	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"Tech");
    generatedPassword = cs.generatePassword();
    cs.showCredentials(employee, generatedEmail, generatedPassword);
    
} else if (option == 2){
	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"Admin");
    generatedPassword = cs.generatePassword();
    cs.showCredentials(employee, generatedEmail, generatedPassword);
    
}else if (option == 3){
	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"Human Resource");
    generatedPassword = cs.generatePassword();
    cs.showCredentials(employee, generatedEmail, generatedPassword);
    
}else if (option == 4 ){
	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"Legal");
    generatedPassword = cs.generatePassword();
    cs.showCredentials(employee, generatedEmail, generatedPassword);
	}
else {
	System.out.println("Select a valid option");
  }


 }

}
