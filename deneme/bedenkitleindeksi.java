//Kullanıcının kilosu ve boyuna göre BKİ'sini veren program
import java.util.Scanner;
public class bedenkitleindeksi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Cinsiyetiniz erkek ise 1'i kadın ise 2'yi seçiniz");
        int cinsiyet = giris.nextInt();
        System.out.println("Kilonuzu giriniz:");
        double kilo = giris.nextDouble();
        System.out.println("Boyunuzu giriniz:");
        double boy = giris.nextDouble();
        double indeks = kilo / (boy*boy);
        if(cinsiyet ==1){
            if(indeks >=25){
                System.out.println("Kilolusunuz ve beden kitle indeksiniz:" + indeks);
            }
            else{
                System.out.println("Kilolu Değilsiniz ve beden kitle indeksiniz:"+ indeks);
            }
        }
        if(cinsiyet ==2){
            if (indeks >=23){
                System.out.println("Kilolusunuz ve beden kitle indeksiniz:"+ indeks);
            }
            else {
                System.out.println("Kilolu Değilsiniz ve beden kitle indeksiniz:"+ indeks);
            }
        }
    }
}
