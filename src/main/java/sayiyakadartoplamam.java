import java.util.Scanner;
public class sayiyakadartoplamam {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int kullanici = giris.nextInt();
        int toplam = 0;
        for (int i = 1; i <=kullanici ; i++)
        {
            toplam += i;
        }
        System.out.println("Sayıların Toplamı:" + toplam);
    }
}

