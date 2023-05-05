import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Üçgenin 1. kenarını giriniz:");
        double kenar1 = giris.nextDouble();
        System.out.println("Üçgenin 2. kenarını giriniz");
        double kenar2 = giris.nextDouble();
        double kenar3 = kenar1*kenar1+kenar2*kenar2;
        System.out.println("Üçgenin Hipotenüsü:" + Math.sqrt(kenar3));
    }
}
