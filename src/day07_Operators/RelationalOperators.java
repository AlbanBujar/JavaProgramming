package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // >, >=, <,  <=

        boolean result1 = 20 > 40; // false

        System.out.println("result1 = " + result1);

       boolean result2 = 300 >= 150; // true
        System.out.println("result = " + result2);

        boolean result3 = 100>= 100; // true equal = esit
        System.out.println("result3 = " + result3);

        int score = 75;
        boolean hasFailed = score <= 59; // false

        System.out.println("hasFailed = " + hasFailed);

        boolean result10 = "Java" == "Java"; //true
        System.out.println("result = " + result10);

        System.out.println("................................ " );

        boolean result11 = 100 != 200.5; // true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != " Break"; //true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; // false
        System.out.println("result13 = " + result13);





    }
}
