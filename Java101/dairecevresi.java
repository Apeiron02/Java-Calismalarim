import java.util.Scanner;
public class dairecevresi {
    public static void main(String [] args){
    final double pi_sayisi = 3.141593;

    Scanner giris = new Scanner(System.in);
    System.out.println("Lütfen yaricap giriniz: ");
    double yaricap = giris.nextDouble();
    System.out.println("Lütfen merkez açısının ölçüsünü giriniz: ");
    int aci = giris.nextInt();
    double cevre = 2 * pi_sayisi *yaricap;
    double alan = (pi_sayisi *(yaricap*yaricap)*aci)/360;
    System.out.println(yaricap + "yarı caplı dairenin çevresi " + cevre + "dir");
    System.out.println(yaricap+ " yarı çaplı "+aci+" merkez açılı daire diliminin alanı "+ alan);

    }
}
