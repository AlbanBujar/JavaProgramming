package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 220.5,
                n2 = 12.5;

        char operator = '$';

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';
    if(valid){
        switch (operator){ //: +, -, *, /

            case '+':
                System.out.println(n1+n2);
                break;

            case '-':
                System.out.println(n1-n2);
                break;

            case '*':
                System.out.println(n1*n2);
                break;

            default:
                System.out.println(n1/n2);

        }

    }else
        System.out.println("Invalid Operators: "+operator);



    }
}
/*
Given two double variables n1, n2 and a char variable named operator.

Use switch statement to calculate the result of

    Valid operator are: -, +, *, /
 */