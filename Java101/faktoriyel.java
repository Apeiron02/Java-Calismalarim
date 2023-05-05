import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int faktoriyel = 1;
        System.out.println("Bir sayı giriniz");
        int kullanici = giris.nextInt();
        for(int i = 1 ; i <= kullanici ; i++)
        {
            faktoriyel *= i;

        }
        System.out.println(kullanici + " sayısının faktöriyeli =" + faktoriyel);
    }
}
