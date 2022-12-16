import java.util.Scanner;

public class sicaklikdonusumu {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Celsius için 1'i Kelvin için 2'yi Fahrenheit için 3'ü seçiniz");
        int secim = giris.nextInt();
        System.out.println("Sıcaklığı giriniz:");
        double sicaklik = giris.nextDouble();
        System.out.println("Hangi sıcaklığa dönüştürüleceğini Celsius(1),Kelvin(2),Fahrenheit(3) seçiniz:");
        int secim2= giris.nextInt();
        if (secim == 1){
            if (secim2 == 2 ){
                double sonuc = sicaklik + 273;
                System.out.println("Sıcaklık Değeri: " + sonuc);
            }
            else {
                double sonuc = sicaklik * 1.8 + 32;
                System.out.println("Sıcaklık Değeri:" + sonuc);
             }
        }
        if (secim == 2 ){
            double sonuc;
            if(secim2 == 1){
                sonuc = sicaklik - 273;

            }
            else {
                sonuc = sicaklik * 9 / 5 - 459.67;
            }
            System.out.println("Sıcaklık Değeri:" + sonuc);
        }
        if (secim ==3 ){
            double sonuc;
            if (secim2 ==1){
                sonuc = (sicaklik - 32) / 1.8;
            }
            else{
                sonuc = (sicaklik + 459.67) * 5 / 9;
            }
            System.out.println("Sıcaklık Değeri:" + sonuc );
        }
    }
}
