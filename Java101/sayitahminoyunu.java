//3 Haklı sayi tahmin oyunu
import java.util.Scanner;
import java.util.Random;
public class sayitahminoyunu {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        Random rastgele = new Random();
        int rastgele_sayi = rastgele.nextInt(101);
        System.out.println("3 HAKLI 0-100 ARASI SAYI TAHMİN OYUNU ");
        int dongu = 1;
        while ( dongu <=3){

            System.out.print("Bir tahmin yapınız: ");
            int tahmin = giris.nextInt();
            if (tahmin == rastgele_sayi){
                System.out.println("Tebrikler bildiniz");
                break;
            }
            if (tahmin >rastgele_sayi){
                System.out.println("Daha küçük sayı giriniz");
                dongu +=1;

            }
            if (tahmin<rastgele_sayi) {
                System.out.println("Daha büyük sayı giriniz");
                dongu += 1;
            }
            if(dongu ==4){
                System.out.println("Bilemediniz sayı "+rastgele_sayi + " idi.");
            }


        }

    }
}
