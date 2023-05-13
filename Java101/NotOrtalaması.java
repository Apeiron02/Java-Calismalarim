import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner giris =new Scanner(System.in);
        System.out.println("Mat Notunuzu Girin: ");
        mat = giris.nextInt();
        System.out.println("Fizik Notunuzu Girin: ");
        fizik = giris.nextInt();
        System.out.println("Kimya Notunuzu Girin: ");
        kimya = giris.nextInt();
        System.out.println("Türkçe Notunuzu Girin: ");
        turkce = giris.nextInt();
        System.out.println("Tarih Notunuzu Girin: ");
        tarih = giris.nextInt();
        System.out.println("Müzik Notunuzu Girin: ");
        muzik = giris.nextInt();
        int top =mat+fizik+kimya+turkce+tarih+muzik;
        float ort =top/6;
        System.out.println("Ortalamanız: "+ort);

    }
}
