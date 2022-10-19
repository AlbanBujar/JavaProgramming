package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch ='J';

        switch ( ch){

            case 'A':
                System.out.println("Passed");
                break;
            case 'B':
                System.out.println("Passed");
                break;
            case 'C':
                System.out.println("Passed");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }
}
/*
if the grade is A or B or C or D ===="passed"
otherwise ===> "Failed"
 */