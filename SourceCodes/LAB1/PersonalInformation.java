/*
 Simple Java program to print personal information.
 Replace the example values with your actual name, faculty, and university.
 This file is part of the `LAB1` package. To compile & run from the
 SourceCodes folder use:
	 javac LAB1\PersonalInformation.java
	 java LAB1.PersonalInformation
*/

package LAB1;

public class PersonalInformation {
	public static void main(String[] args) {
			// Update these values to your actual details
			String name = "Er. Baburam Shrestha";
            int age = 28;
            String phone = "+977-9800000000";
            String email = "babu@example.com";
            String address = "Kathmandu, Nepal";
			String faculty = "BCA";
            String rollNumber = "BCA-2020-001";
            String semester = "6th Semester";
			String university = "Tribhuwan University";

			System.out.println("Name       : " + name);
            System.out.println("Age        : " + age);
            System.out.println("Phone      : " + phone);
            System.out.println("Address    : " + address);
            System.out.println("Email      : " + email);
			System.out.println("Faculty    : " + faculty);
            System.out.println("Roll No.   : " + rollNumber);
            System.out.println("Semester   : " + semester);
			System.out.println("University : " + university);	
	}
}
