import java.util.Scanner;

public class teksayileritopla {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int i;
        int toplam = 0;
        do {
            System.out.println("Sayı giriniz:");
             i = giris.nextInt();
            if (i % 2 ==1 ){
                toplam += i;
            }
        }while ( i> 0);

        System.out.println(toplam);
        }
    }

