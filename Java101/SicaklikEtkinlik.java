import java.util.Scanner;

public class SicaklikEtkinlik {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.print("Sıcaklığı Giriniz: ");
        int sicaklik = giris.nextInt();

        if (sicaklik < 5){
            System.out.print("Kayak Yapabilirsiniz.");
        }else{
            if (sicaklik <= 15){
                System.out.print("Sinemaya Gidebilirsiniz.");
            }
        }
        if (sicaklik >15 && sicaklik <25){
            System.out.print("Pikniğe Gidebilirsiniz.");
        }
        if (sicaklik >=25){
            System.out.print("Yüzme Yapabilirsiniz.");
        }
    }
}
