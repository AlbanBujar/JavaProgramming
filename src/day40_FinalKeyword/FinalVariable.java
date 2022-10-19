package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
     final static String name; // final yerine static yazarsak name degisir "Batch 25"; yerine Python yazadiririz.

    static {
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }


    public static void main(String[] args) {

         final double pi = 3.14;

         //pi = 4.14; final variables can not be reassigned pi degismez final yazdik cunku
        //pi = 5.14;

        final String name;

        name = "Java";
        //name = "Wooden Spoon"; java degisme final yazdik cunku
        System.out.println(name);

        System.out.println("------------------------------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
       // obj.birthDay = "June/01"; // final variables can not be  reassined

        System.out.println(obj.birthDay);

        System.out.println("------------------------------------------------------------");

        // FinalVariable.name = "Pyhton"; final variables can not be  reassined
        System.out.println(FinalVariable.name);

    }
}
