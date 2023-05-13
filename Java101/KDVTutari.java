import java.util.Scanner;
public class KDVTutari {
    public static void main(String[] args) {
        double tutar , KDV , KdvliTutar , KdvTutari ;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Fiyatını Giriniz : ");
        tutar = input.nextDouble();

        boolean KdvOrani = (0 < tutar) && (tutar < 1000);
        KDV = KdvOrani ? 0.18 : 0.08 ;
        KdvTutari = tutar * KDV ;
        KdvliTutar = tutar + KdvTutari ;

        System.out.println("Ürün Fiyatı : " + tutar);
        System.out.println("KDV Tutarı : " + KdvTutari);
        System.out.println("KDV'li Fiyat : " + KdvliTutar);

    }
}

