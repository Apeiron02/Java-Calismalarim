import java.util.Scanner;

public class TaksiMetreHesabi {
    public static void main(String[] args) {
        int km;
        double price = 2.20,total,startPrice = 10;
        Scanner giris = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        km = giris.nextInt();
        total =(km *price);
        total +=startPrice;
        total=(total <20) ? 20 : total;
        System.out.println("Toplam Tutar: "+ total);


    }
}
