package day09_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {

        int n1 = 78;
        int n2 = 299;

        boolean maximumNumber = n1 >= n2 && n2 <= n1;

        if(maximumNumber){
            System.out.println(n1+" is maximum number");
        } else {
            System.out.println(n2+" is maximum number");
        }


    }
}
