import java.util.Scanner;

public class ManavProg {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates =1.11;
        double muz = 0.95;
        double patlican = 5.00;

        Scanner giris =new Scanner(System.in);
        System.out.print("Armut Kaç Kilo:");
        int armut1 = giris.nextInt();
        System.out.print("Elma Kaç Kilo:");
        int elma1 = giris.nextInt();
        System.out.print("Domates Kaç Kilo:");
        int domates1 = giris.nextInt();
        System.out.print("Muz Kaç Kilo:");
        int muz1 = giris.nextInt();
        System.out.print("Patlican Kaç Kilo:");
        int patlican1 = giris.nextInt();
        double toplam = (armut*armut1)+(elma*elma1)+(domates*domates1)+(muz*muz1)+(patlican*patlican1);
        System.out.println("Toplam: "+toplam);
    }
}
