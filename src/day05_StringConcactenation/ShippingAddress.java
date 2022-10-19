package day05_StringConcactenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name  = "James King";
        String buildingNumber = "12354B";
        String stretName = "Jones Branch Dr";
        String city = "McLean ";
        String state = " VA";
        String zipCode = "BS123HB";

        String adress = name + "\n" + buildingNumber + " " + stretName +
                "\n" + city +", " + state +" "+ zipCode;

        System.out.println(adress);


        /* \n yeni line aciyor
            James King
            12354B Jones Branch Dr
            McLean ,  VA BS123HB
         */


    }
}

/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:

1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode

3. Use concatenation to print the full address

 */