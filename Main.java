package org.example;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int fizik,matematik, turkce, kimya,muzik;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuz Giriniz : ");
        matematik = input.nextInt();
        System.out.println("Fizik Notunuzu Girinizi : ");
        fizik = input.nextInt();
        System.out.println("Kimya Notunuzu Girinizi : ");
        kimya = input.nextInt();
        System.out.println("Turkce Notunuzu Girinizi : ");
        turkce = input.nextInt();
        System.out.println("Muzik Notunuzu Girinizi : ");
        muzik = input.nextInt();
        int toplamNot = 0;
        int not = 0;

        System.out.print("Matematik Notunuz:");

        if (matematik > 0 && matematik <= 100)
        {
            toplamNot = toplamNot + matematik;
            not++ ;
        }
        System.out.print("Türkçe Notunuz: ");

        if (turkce > 0 && turkce <= 100)
        {
            toplamNot = toplamNot + turkce;
            not++ ;

        }
        System.out.print("Fizik Notunuz: ");
        if (fizik > 0 && fizik <= 100)
        {
            toplamNot = toplamNot + fizik;
            not++ ;
        }
        System.out.print("Kimya Notunuz: ");
        if (kimya > 0 && kimya <= 100)
        {
            toplamNot = toplamNot + kimya;
            not++ ;
        }
        System.out.print("Müzik Notunuz: ");
        if (muzik > 0 && muzik <= 100)
        {
            toplamNot = toplamNot + muzik;
            not++ ;
        }

        double avarage  = toplamNot/not;

        if (avarage <= 55){
            System.out.println("Sınıfta kaldınız. Seneye Görüşmek üzere");
        }else {
            System.out.println("Tebrikler, Sınıfı Geçtiniz");
        }

        System.out.println("Ortalamaniz : " + avarage);
    }
}
