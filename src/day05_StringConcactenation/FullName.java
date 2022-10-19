package day05_StringConcactenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Jimmy";
        String lastName = "King";
        int age = 55;
        String jobTitle = "Senior SDET";
        String companyName = "Aplle Inc";

        double salary =100000.58;



        String fullName = firstName + " " + lastName;
            //Full name of the person is ......
        System.out.println("Full name of the person is " + fullName);

            //.....is....years old.
        System.out.println(fullName + " is " + 55 + " years old." );
        System.out.println("FullName is JobTitle" + ", work at CompanyName");

        System.out.println(fullName + " is  " + jobTitle +", works at " + companyName
                +", and " +fullName + "`s salary is $ "+ salary);
    }
}
