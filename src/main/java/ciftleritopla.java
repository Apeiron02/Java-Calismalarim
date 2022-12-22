import java.util.Scanner;

public class ciftleritopla {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        int i ;
        int toplam =0;
        do {
            System.out.print("Bir sayı girin:");
            i = giris.nextInt();
            if (i%4 ==0){
                toplam +=i;
            }
        }while (i %2 ==0);
        System.out.println(toplam);
    }
}
