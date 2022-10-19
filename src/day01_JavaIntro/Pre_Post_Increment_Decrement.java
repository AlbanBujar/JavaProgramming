package day01_JavaIntro;

public class Pre_Post_Increment_Decrement {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = sayi1 +1;

/*
pre veya post increment / decrement
sadece ++ ve -- islemi icin gecerlidir
bu iki islem icin sayidan sonra veya once yazilmasina gore farkli iki isleyis olur
 */

sayi2 +=5; // sayi --->16

        int sayi3 = sayi2++; // 1- sayi2 degeri 1 artirilacak
                            // 2- sayi2 degeri, sayi3`e atanacak
        /*
        ++ veya -- variable dan once ise buna post... denir.
bu durumda o satirda yapilan iki islemden
artirma veya azaltma islemi sonuncudur. Once deger ata sonra artir veya eksilt

Ornek: int sayi3 = sayi2++; sayi2 16 degerini ilk once sayi3 atiyoruz. Sayi3 16 oldu
             16       16  daha sonra sayi2 ye bir daha ekliyoruz 17 oldu.

         */

        System.out.println("sayi3 "+sayi3); //16
        System.out.println("sayi2 "+sayi2); //17


int sayi4 = ++sayi1;  // 1- sayi1 degeri 1 artirilacak
                      // 2- sayi1 degeri, sayi4`e atanacak
/*
eger ++ veya -- variable dan once ise buna pre... denir.
bu durumda o satirda yapilan iki islemden oncelikli olan
artirma veya azaltmadir.
 */
        System.out.println("sayi4 "+sayi4);
        System.out.println("sayi1 "+sayi1);

    }
}
