package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter yor full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter yor building number:");
        String building = scan.next();//7925

        scan.nextLine();

        System.out.println("Enter yor street name:");
        String street = scan.nextLine(); // jones Branch DriveEnter

        System.out.println("Enter yor city name:");
        String cityName = scan.nextLine();// McLeanEnter

        System.out.println("Enter yor state:");
        String state = scan.next();//VAEnter

        System.out.println("Enter yor zipcode:");
        String zipcode = scan.next();//22012Enter

        scan.nextLine();//EnterEnter

        System.out.println("Enter yor country name:");
        String country = scan.nextLine();


    }
}

/*
1.Enter your full name ( nextline() )
2.Enter your building number ( next ()  )
3.Enter your Street name ( nextline() )
4.Enter your city name   ( nextline() )
5.Enter your  state     ( next ()  )
6.Enter your zip code   ( next ()  )

Display the shipping address
 */