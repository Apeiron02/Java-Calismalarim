import java.util.Scanner;
public class girilensayinincesidi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        double sayi = giris.nextDouble();
        if (sayi == 0) {
            System.out.println("Sayı 0 dır");
        }
        if (sayi > 0 ) {
            System.out.println("Sayı pozitiftir");
        }
        if (sayi < 0 )  {
            System.out.println("Sayı negatiftir");
        }
    }
}

