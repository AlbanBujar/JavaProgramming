package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, Ilove learning Java";
        String str2 = str.replace("Java" , "Phyton"); //"Python is fun, Ilove learning Python"

        System.out.println("str = "+str);
        System.out.println("str2 = "+str2);

        String email = "JohnSmith@yahoo.com";
        String email2 = email.replace("yahoo", "gmail");

        System.out.println("email ="+email); //gmail
        System.out.println("email2 ="+email2);

        String sentence = " Java Java Pyhton Pyhton C# C# C++ C++ Pyhton  Pyhton Pyhton Pyhton ";
        String sentence2 =sentence.replace("Pyhton", "")  ; // Java Java  C# C# C++ C++

        System.out.println("sentence2 = " + sentence2);

        sentence2= sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog Dog Dog ";
        s = s.replace("Dog" , "Cat");
        System.out.println("s = "+s);

        String s2 = "C# is fun, Java is cool";

        s2 = s2.replace("C# is c" , "Java is c");
        System.out.println("s2 = "+s2);

        String s3 = "Java";
        s3 =s3.replace("a", "e");

        System.out.println("s3 = "+s3);

        System.out.println("--------------------------------");

        String result = "Java Java Java";

        result= result.replaceFirst("Java", "Python");

        System.out.println("result = "+result);


    }
}
