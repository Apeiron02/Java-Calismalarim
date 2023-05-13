import java.util.Scanner;

public class UckenAlani {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.println("Birinci Kenar uzunluğu: ");
        int kenar1 = giris.nextInt();
        System.out.println("İkinci Kenar uzunluğu: ");
        int kenar2 = giris.nextInt();
        System.out.println("Üçüncü Kenar uzunluğu: ");
        int kenar3 = giris.nextInt();
        double u = (kenar1+kenar2+kenar3)/2.0;
        double alan= Math.sqrt(u *(u-kenar1)*(u-kenar2)-(u-kenar3));
        System.out.println("Üçgenin Alanı: "+alan);



    }
}
