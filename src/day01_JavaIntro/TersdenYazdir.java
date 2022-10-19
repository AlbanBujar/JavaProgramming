package day01_JavaIntro;

import java.util.Scanner;

public class TersdenYazdir {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz: ");
        String str = scan.nextLine();
        reverseString(str);
        System.out.println("Girilen string ifadenin tersi : "+reverseString(str));

    }

    private static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {// son karakterden baslayip geriye giderek, butun karakterleri yazdirdik...
           reversed += str.charAt(i);
        }
        return reversed; // String ifadenin tersini dondurur.
    }
}
/*
Wite a Java program to reverse a string. Use for loop and create a method called reverseString
 */
