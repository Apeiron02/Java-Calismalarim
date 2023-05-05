import java.util.Random;
import java.util.Scanner;
public class taskagitmakas {
    public static void main(String[] args){
        //*Taş = 0
        //*Kağıt = 1
        //*Makas = 2
        System.out.println("Taş Kağıt Makas Oyunu");
        Random rastgele= new Random();
        Scanner giris = new Scanner(System.in);
        int rastgelesayi = rastgele.nextInt(3);
        System.out.println("""
                Taş = 0
                Kağıt = 1
                Makas = 2
                Kullanıcı girişi""");
        int kullanici = giris.nextInt();

        if (rastgelesayi == kullanici){
            System.out.println("Berabere");
        }
        if(kullanici ==0 && rastgelesayi ==1 ){
            System.out.println("kullanıcı kaybetti bilgisayarın seçtiği kağıttı");
        }
        if (kullanici ==2 && rastgelesayi ==1 ){
            System.out.println("kullanıcı kazandı bilgisayarın seçtiği kağıttı");
        }
        if (kullanici ==0 && rastgelesayi ==2 ){
            System.out.println("kullanıcı kazandı bilgisayarın seçtiği makastı");
        }
        if (kullanici ==1 && rastgelesayi ==2 ){
            System.out.println("kullanıcı kaybetti bilgisayarın seçtiği makastı");
        }
        if (kullanici ==1 && rastgelesayi ==0 ){
            System.out.println("kullanıcı kazandı bilgisayarın seçtiği taştı");
        }
        if (kullanici ==2 && rastgelesayi ==0 ){
            System.out.println("kullanıcı kaybetti bilgisayarın seçtiği taştı");
        }

    }
}
