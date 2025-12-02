/*
 Program to take personal information from user input.
 To compile & run:
     javac LAB1\PersonalInformation.java
     java LAB1.PersonalInformation
*/

package LAB1;

import java.util.Scanner;

public class PersonalInformationInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your faculty: ");
        String faculty = sc.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNumber = sc.nextLine();

        System.out.print("Enter your semester: ");
        String semester = sc.nextLine();

        System.out.print("Enter your university: ");
        String university = sc.nextLine();

        System.out.println("\n--- Personal Information ---");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Phone      : " + phone);
        System.out.println("Email      : " + email);
        System.out.println("Address    : " + address);
        System.out.println("Faculty    : " + faculty);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Semester   : " + semester);
        System.out.println("University : " + university);

        sc.close();
    }
}
