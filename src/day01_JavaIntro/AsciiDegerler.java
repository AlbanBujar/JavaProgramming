package day01_JavaIntro;

import java.util.Scanner;

public class AsciiDegerler {
    public static void main(String[] args) {

        // System.out.println("****************** for ile ****************");

        // for (int i = 0; i <=255 ; i++) {
        //    char letter = (char) i;
        //    System.out.println(i+ " ===> " + letter);
        //}

        System.out.println("****************** while ile ****************");
        int i = 0;
        while (i <= 255) {
            char c = (char) i;
            System.out.println(i + " ===> " + c);
            i++;
        }
    }
}

/*
0-255 e kadar olan harflerin, sayi ve harf degerlerini ekrana yazdiriniz.
 */