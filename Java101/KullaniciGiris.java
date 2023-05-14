import java.util.Objects;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String dataName = "Patika" ;String DataPas ="Java101";
        Scanner giris =new Scanner(System.in);
        System.out.print("Kullanıcı Adını Giriniz: ");
        String userName = giris.nextLine();
        System.out.print("Şifreniz: ");
        String password = giris.nextLine();

        if (userName.equals(dataName)&& password.equals(DataPas)){
            System.out.println("Giriş Başarılı");
        }
        if (!userName.equals(dataName)){
            System.out.println("Kullanıcı Adınız Yanlış");
        }
        else if (!password.equals(DataPas)){
            System.out.println("Şifreniz Yanlış");
            System.out.println("Şifrenizi Değiştirmek istiyorsanız 1'e basınız");
            int secim = giris.nextInt();

            if(secim ==1){
                System.out.print("Yeni Şifrenizi Giriniz: ");
                String YeniSifre = giris.nextLine();
                if (YeniSifre.equals(DataPas)){
                    System.out.println("Şifreniz Aynı Olduğundan Değişmedi.");
                }
                else {
                    System.out.print("Şifrenizi Giriniz: ");
                    String NewPass = giris.nextLine();
                    System.out.print("Şifreniz Değiştirildi.");
                }
            }
        }

    }
}
