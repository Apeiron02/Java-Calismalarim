import java.util.Scanner;
public class ikisayinintoplami {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz:");
        int birinci= giris.nextInt();
        System.out.print("2. Sayıyı giriniz:");
        int ikinci = giris.nextInt();
        int toplam = birinci + ikinci;
        System.out.println("Sayıların toplamı:" + toplam);

    }

}
