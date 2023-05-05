import java.util.Scanner;
public class tekmiciftmi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        double kullanici = giris.nextDouble();
        double bolum = kullanici %2;
        if(bolum == 1){
           System.out.println("Sayı Tektir");

        }
        else{
            System.out.println("Sayı Çifttir");
        }
    }
}
