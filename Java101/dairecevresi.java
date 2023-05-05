import java.util.Scanner;
public class dairecevresi {
    public static void main(String [] args){
    final double pi_sayisi = 3.141593;

    Scanner giris = new Scanner(System.in);
    System.out.println("Lütfen yaricap giriniz: ");
    double yaricap = giris.nextDouble();
    double cevre = 2 * pi_sayisi *yaricap;
    System.out.println(yaricap + "yarı caplı dairenin çevresi " + cevre + "dir");
    }
}
