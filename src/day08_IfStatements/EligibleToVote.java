package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String  name = "Josh";
        int age = 38;
        String citizien = "USA";

        boolean isEligible = age >= 21 && citizien == "USA"; // True

        //Eligible
        if(isEligible) { // True
            System.out.println("Eligible");
        }
            //Eligible
            if(!isEligible) { // !True ==> not true ==> false
                System.out.println("Not Eligible");
            }
            }
}
