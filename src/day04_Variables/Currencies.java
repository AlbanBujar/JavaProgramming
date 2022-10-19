package day04_Variables;

public class Currencies {
    public static void main (String[] args) {
        //jpy, pound, peso, cad, riyal, rub...

        int dollar = 1000;

        double lira = dollar * 9.53;
        double euro = dollar  * 0.86;
        double jpy =  dollar * 1.25;
        double pound = dollar * 1.52;
        double peso = dollar * 0.78;
        double cad = dollar * 1.32;
        double riyal = dollar * 0.93;
        double rub = dollar * 0.68;

        System.out.println("rub = " + rub);
        System.out.println("riyal = " + riyal);
        System.out.println("cad = " + cad);
        System.out.println("peso = " + peso);
        System.out.println("pound = " + pound);
        System.out.println("jpy = " + jpy);
        System.out.println("euro = " + euro);
        System.out.println("lira = " + lira);




    }
}
