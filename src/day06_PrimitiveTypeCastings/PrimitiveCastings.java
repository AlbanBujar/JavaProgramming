package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        int x = 55;
        short y = (short) x;

        System.out.println(x+ " : " +x);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j+" : "+k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l+" : "+m);


    }
}

/*
Primitives:

	double > float > long > int > short > byte
      f         e      d     c      b       a

	smaller primitives can be directly assigned to larger primitive type
	larger ptimitives can NOT be directly assigned to smaller primitive types (need to be casted manually)
 */