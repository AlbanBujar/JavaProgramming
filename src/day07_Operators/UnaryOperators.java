package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0); // false
        System.out.println(num2 < 0); // true

        System.out.println("................................");
            int z =45;

        System.out.println( ++z); // 46,z =46
        System.out.println( z++); // 46,z =47
        System.out.println( z); // 47

        System.out.println("................................");
        int q =30;

        System.out.println( --q); // 29, q =29
        System.out.println( q--); // 29, q =28
        System.out.println( q); // 28

    /*

    ++: increase the value by 1.
	-- : decreases the value by 1.

	Post vs Pre:
		Pre : changes the value immediately
				++ a
				-- a

		post: changes the value in the second step.
				a ++
				a --


        int x = 100;

	    x = 200

        String str = "Java";

	    str += " Programming";

        int a = 400;

        a += 300;
     */

    }
}
