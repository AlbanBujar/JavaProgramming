package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//EnterEnter

        System.out.println("Enter your age");
        int age = scan.nextInt(); //19Enter

        System.out.println("Enter your gender");
        String gender = scan.next(); //MaleFemale

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine(); // if the previous' scanner method that`s used is not nextLine(), then we need provide one more nextLine()Method

        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong(); //123456789

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt(); //HB5466

        scan.nextLine();

        System.out.println("Enter your School name");
        String schoolName = scan.nextLine(); //CYDEO school

        System.out.println("Enter your city name");
        String cityName = scan.nextLine(); //NewYork

        System.out.println("Enter your state name");
        String stateName = scan.next(); //Washington

        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt(); //451

        System.out.println("Enter your Street name");
        String streetName = scan.next(); //Alban street

        scan.close();

        System.out.println("Full Name : " +fullName);
        System.out.println("Age : "+ age);
        System.out.println("Gender : "+ gender);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Adress : \n\t"+buildingNumber +" "+streetName +"\n\t"+cityName+","+" "+stateName+" "+zipCode);
        System.out.println("School Name : "+schoolName);

    }
}

/*
warmup tasks:
	1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int--->nextInt())
			2. Enter your gender (String- One word ONLYint--->next()) nextLine()
			3. Enter your full name (String- Multiple words--->nextLine())
			4. Enter your phone number (long--->nextLong())
			5. Enter your zip code (int--->nextInt())  nextLine()
			6. Enter your School name (String- Can be Multiple words--->nextLine())
			7. Enter your city name (String- Can be Multiple words--->nextLine())
			8. Enter your state name (String- One word ONLY--->next())
			9. Enter your building number (int--->nextInt()) nextLine()
			10. Enter your Street name(--->nextLine())

		MAKE SURE USER CAN ENTER ALL THE INPUT

		Display all the inputs that user entered in following order in sperate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode

			6. school name
 */