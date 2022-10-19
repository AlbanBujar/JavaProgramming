package utlities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccesModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //System.out.println(AccesModifiers_Test4.name1); // default is not visible outside the package
        System.out.println(AccesModifiers_Test4.name2);  // protected is visible outside in subclass ONLY


        //AccesModifiers_Test4.method1();
        AccesModifiers_Test4.method2();
    }
}
