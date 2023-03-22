import java.util.Scanner;
public class MetotUstHesabi {
    static void ust(){
        int a;int b;
        Scanner giris = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz:");
        a = giris.nextInt();
        System.out.print("Üst Değerini Giriniz:");
        b = giris.nextInt();
        int sonuc = 1;
        for (int i =1;i<=b;i++){
            sonuc *=a;
        }
         System.out.println(sonuc);
    }
    public static void main(String[] args) {
        ust();
    }
}
