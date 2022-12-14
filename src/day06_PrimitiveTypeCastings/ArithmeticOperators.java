package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(10 + 20); // 30 Addition
        System.out.println(100 - 50); // 50, subtraction
        System.out.println(10 * 6); // 60, multiplication

        System.out.println( 100 / 3 ); //33
        System.out.println( 10.0/4 ); //2.5
        System.out.println( 10/4.0 ); //2.5
        System.out.println( 10d/4 );//2.5

        int a = 100;
        double b = a/6 ; //16.0

        System.out.println(b);

        double c = (double)a/b; //16.6666
        System.out.println(c);

    }


}

/*
    ADDITION : +
    SUBTRACTION : -
    DIVISION : /
        in math : 10/4 =2.5     100/3 = 33.333....

        in Java : 10/4= 2      100/3 = 33
        10.0/4 = 2.5           100.0/3 = 33.3
        10/4.0 =2.5
        10d/4 =2.5

    MULTIPLICATION  : *
    MODULUS : %

 */