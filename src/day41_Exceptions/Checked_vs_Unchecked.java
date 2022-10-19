package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {

    public static void main(String[] args) throws InterruptedException {
        //unchecked exception:

        int a = 10;
        int b = 0;

        //System.out.println( a / b );
        // System.out.println("Wooden Spoon");

        char[] characters = {'A', 'B', 'C'};
        //                     0,   1,   2

        //  System.out.println( characters[99] );

        String str2 = ""; // object != null

        System.out.println(str2.isEmpty());


        // checked Exeption:

        System.out.println("Hello");

        // Thread.sleep(3000);

        System.out.println("Cydeo");

        // FileInputStream file = new FileInputStream(name:"path of the file");

        System.out.println("Java".charAt(1000)); // unchecked


    }
}
