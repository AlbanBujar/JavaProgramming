package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch = 'B'; // ==
        String words = "";

        switch (ch) {
            case   'A':
                System.out.println("Excellent");
                break;
            case   'B':
                System.out.println("Great Job");
                break;
            case   'C':
                System.out.println("Good");
                break;
            case   'D':
                System.out.println("Passed");
                break;
            case  'F' :
                System.out.println("Failed");
                break;
             default:
                 System.out.println("Invalid");
        }

        System.out.println(".....................................");

        char cha = 'G'; // ==
        String result = "";

        switch (cha) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";

                System.out.println(result);
        }

    }
}
/*
a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */