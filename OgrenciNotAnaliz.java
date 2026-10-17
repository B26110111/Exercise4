package Main.java;
import java.util.Scanner;

public class OgrenciNotAnaliz {

      // Kullanıcıdan notları al
    public static void notlariAl(int[] notlar) {
      try   (Scanner input = new Scanner(System.in)) {
			for (int i = 0; i < notlar.length; i++) {
			    System.out.print((i + 1) + ". öğrencinin notu: ");
			    notlar[i] = input.nextInt();
			}
		}
    }

    //  sınıf ortalamasını hesapla
    public static double ortalamaHesapla(int[] notlar) {
        int toplam = 0;

        for (int not : notlar) {
            toplam += not;
        }

        return (double) toplam / notlar.length;
    }

    // en yüksek notu bul
    public static int enYuksekNot(int[] notlar) {
        int enYuksek = notlar[0];

        for (int i = 1; i < notlar.length; i++) {
            if (notlar[i] > enYuksek) {
                enYuksek = notlar[i];
            }
        }

        return enYuksek;
    }

    // başarılı öğrenci sayısını bul
    public static int basariliSayisi(int[] notlar) {
        int sayac = 0;

        for (int not : notlar) {
            if (not >= 50) {
                sayac++;
            }
        }

        return sayac;
    }

    //  Sonuçları ekrana yazdır
    public static void sonuclariYazdir(double ortalama, int enYuksek, int basarili) {
        System.out.println();
        System.out.println("===== ANALİZ SONUÇLARI =====");
        System.out.println("Sınıf ortalaması: " + ortalama);
        System.out.println("En yüksek not: " + enYuksek);
        System.out.println("Başarılı öğrenci sayısı: " + basarili);
    }

    // Ana program
    public static void main(String[] args) {

        
        int[] notlar = new int[5];

        System.out.println("===== ÖĞRENCİ NOT ANALİZ SİSTEMİ =====");

        
        notlariAl(notlar);

     
        double ortalama = ortalamaHesapla(notlar);

     
        int enYuksek = enYuksekNot(notlar);

        
        int basarili = basariliSayisi(notlar);

      
        sonuclariYazdir(ortalama, enYuksek, basarili);
    }
}