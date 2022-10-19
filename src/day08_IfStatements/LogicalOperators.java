package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
        //                     19>=18 && "UK" == "USA"
        //                    true   &&   false ===> false

        System.out.println(name+ " is eligible to vote: "+isEligible);

        System.out.println(".............................");

        String name2 ="Josh";

        int creditScore = 720;
        int age2 = 23;

        boolean isEligible2 =creditScore >= 700 && age2 >= 21;
        System.out.println(name2+ " is eligible to vote: "+isEligible2);

        System.out.println(".............................");

        String name3 = "Say";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender =='M'|| gender =='F');

        System.out.println(name3 + " is eligible to register: "+isEligible3);

        System.out.println(".............................");

        String name4 = "James";

        String countryOfBirth = "UK";
        boolean marriedToUSCitizien = false;

        boolean isEligible4 = countryOfBirth == "USA" ||marriedToUSCitizien == true;

        System.out.println(name4 + "is eligible to apply for UScitizenShip: "+isEligible4);

    }
}
