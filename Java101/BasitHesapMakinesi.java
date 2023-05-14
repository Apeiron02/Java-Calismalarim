import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner giris =new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int s1 = giris.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        int s2 = giris.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        int select = giris.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam Sonucu: "+ (s1+s2));
            case 2:
                System.out.println("Çıkarma Sonucu: "+(s1-s2));
            case 3:
                System.out.println("Çarpma Sonucu: "+ (s1*s2));
            case 4:
                if (s2 ==0){
                    System.out.println("Bir Sayı 0'a Bölünemez");
                }
                else {
                    System.out.println("Bölme Sonucu: "+ (s1/s2));
                }
        }
    }
}
