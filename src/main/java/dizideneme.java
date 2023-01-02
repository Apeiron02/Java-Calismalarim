//Diziye eklenen 5 sayıyı küçükten büyüğe sıralayan program
import java.util.Scanner;

public class dizideneme {
    public static void main(String[] args) {
    Scanner giris= new Scanner(System.in);
    int dizi[] =new int[5];
    for(int i =0 ;i<dizi.length;i++){
         System.out.println(i+1 +" "+"Sayı girin;");
         dizi[i]= giris.nextInt();
         }
    for(int i=0 ;i< dizi.length;i++)
         {

             for (int j=1 ;j<(dizi.length-i);j++)
             {
                 if (dizi[j-1]>dizi[j])
                 {
                     int temp = dizi[j-1];
                     dizi[j-1]=dizi[j];
                     dizi[j]=temp;

                 }

             }
         }

        System.out.println(java.util.Arrays.toString(dizi));
    }
}

/*import java.util.Scanner;
import java.util.Random;

public class dizideneme{
        public static void main(String[] args) {
            int[] dizi = new int[5];
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < dizi.length; i++) {
                System.out.println(i + 1 + "Sayı girin");
                dizi[i] = scan.nextInt();
                dizi[i] = rand.nextInt(101);
            }
            System.out.println(java.util.Arrays.toString(dizi));

            for (int i = 0; i < dizi.length; i++) {

                for (int j = 1; j < (dizi.length - i); j++) {

                    if (dizi[j - 1] > dizi[j]) {
                        int temp = dizi[j - 1];
                        dizi[j - 1] = dizi[j];
                        dizi[j] = temp;

                    }
                }
            }

            System.out.println(java.util.Arrays.toString(dizi));
        }
    }*/
