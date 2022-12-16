import java.util.Scanner;
public class saticiucreti {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        double satis,ucret;
        System.out.println("Satış Adedini Giriniz:");
        satis = giris.nextDouble();

        if (satis < 50){
            ucret = 15.0 + satis;

        }else {
            ucret = 15.0 + 50*2.0 + (satis-50) *3.0 ;

        }
        System.out.println("Günlük Ücretiniz:" + ucret);

    }
}
