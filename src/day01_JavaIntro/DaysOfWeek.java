package day01_JavaIntro;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your day: ");
        String dayName = scan.next().toLowerCase();


        if (dayName.equals("pazar") || dayName.equals("cumartesi")){
            System.out.println("weekend");

        } else if (dayName.equals("pazartesi")||dayName.equals("sali")||
                dayName.equals("carsamba")||dayName.equals("persembe")||
                dayName.equals("cuma")) {

            System.out.println("weekday");

        }else {
            System.out.println("Invalid! Please Enter age day name");
        }
    }
}
