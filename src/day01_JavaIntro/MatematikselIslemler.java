package day01_JavaIntro;

public class MatematikselIslemler {

    public static void main(String[] args) {
        int sayi = 10;

        System.out.println("pre-increment : "+  ++ sayi); // 1-- Artirma
                                                 // 11       2-- Yazdirma

        System.out.println("post-increment : "+   sayi++); // 1-- Yazdirma
                                                 // 11       2-- Artirma

                               //  sayi 12 oldu simdi
        System.out.println("post-increment`den sonra: " + sayi); // 12
    }

}
