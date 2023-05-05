import java.util.Scanner;

public class logaritma {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double a = giris.nextDouble();
        double b = giris.nextDouble();
        double log = Math.log10(b)/Math.log10(a);
        System.out.println(log);
    }
}
