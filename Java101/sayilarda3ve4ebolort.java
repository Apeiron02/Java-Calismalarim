import java.util.Scanner;

public class sayilarda3ve4ebolort {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        double toplam=0;
        System.out.println("bir sayı giriniz;");
        int sayi= giris.nextInt();
        for (int i =0 ;i<sayi; i++){
            if (i%12==0) toplam += i;

        }
        System.out.println(toplam);
        double ort = toplam/sayi;
        System.out.println(ort);

    }
}
