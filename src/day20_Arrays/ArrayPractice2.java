package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char [] letters = new char[26];
        //letters [0]= 'A';
        //letters [1]= 'B'; // Bu sekilde 26 defa yapmak lazim ama loop ile kisa sekilde yapilir

        /*
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }
         */

        for (char i = 'A', j=0; i <= 'Z' && j<letters.length; i++, j++){
           letters[j] =i;
        }

        System.out.println(Arrays.toString(letters)); // [A~Z}







    }
}
