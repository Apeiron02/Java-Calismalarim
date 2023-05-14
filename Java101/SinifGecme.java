import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,kimya,biyo,turkce,muzik;

        Scanner giris = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = giris.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = giris.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = giris.nextInt();
        System.out.print("Biyoloji Notunuzu Giriniz: ");
        biyo = giris.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = giris.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = giris.nextInt();

        if (mat < 0 || mat > 100 || fizik < 0 || fizik > 100 ||
                kimya < 0 || kimya > 100 || turkce < 0 || turkce > 100 || muzik < 0 || muzik > 100) {
            System.out.println("Yanlış giriş yaptınız. Lütfen 0-100 arasında notlar giriniz.");
        }else{
            double ort = (mat+fizik+kimya+biyo+turkce+muzik)/6;
            if (ort >55){
                System.out.print("Ortalamanız "+ort+" geçtiniz.");
            }
            {
                System.out.print("Ortalamanız "+ort+" kaldınız.");
            }
        }

    }
}
