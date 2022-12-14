package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = "        ";

        boolean r = str.isEmpty();

        System.out.println(r);

        boolean r1 = str.isBlank();// bosluk dolduruyor dolu demek (isBlank)

        System.out.println(r1);

        String str2 ="Cydeo      ";

        System.out.println(str.isBlank());

        System.out.println("------------------------------------");

        String s1 ="CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        //Yes, YES, yEs, yES.......

        //System.out.println("yEs".equals("Yes"));// fALSE CUNKU (Yes) aynen yazmadi

        System.out.println("yEs".equalsIgnoreCase("Yes"));// True cunku IgnoreCase kullandi o duzeltiyor


        System.out.println("------------------------------------");

        String sentence ="My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("Java2");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println(hasCSharp);
        System.out.println(hasJava2);
        System.out.println(hasJava);
        System.out.println(hasJava3);

        System.out.println("------------------------------------");
        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));//false

        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA"));// true

        System.out.println("------------------------------------");
        String a ="Wooden Spoon";

        boolean x = a.startsWith("Woo");//true
        boolean y = a.endsWith("Spoon");//true
        boolean z = a.toLowerCase().startsWith("wooden");
        //in order to ignore the case sensitivy we first create the lower case or upper case version of string  and than cpmpare it with lowecase/uppercase

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
