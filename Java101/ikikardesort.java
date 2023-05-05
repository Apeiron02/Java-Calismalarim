import java.util.Scanner;
public class ikikardesort {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        System.out.print("Birinci Kardeşin Yaşı=");
        int kardes1 = giris.nextInt();
        System.out.print("İkinci Kardeşin Yaşı=");
        int kardes2 = giris.nextInt();

        int toplam =kardes1 + kardes2;
        double ortalama = toplam/ 2.0 ;
        System.out.println("Kardeşlerin Ortalaması: " + ortalama);



    }
}
