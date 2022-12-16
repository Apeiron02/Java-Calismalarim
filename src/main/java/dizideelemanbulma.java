import java.util.Scanner;

public class dizideelemanbulma {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        int dizi[] = {3,5,6,534,23,12,76,45,43,99};
        System.out.println("Bir değer arayın:");
        int kullanici= giris.nextInt();
        for(int i =0 ; i<dizi.length; i++){
            if(kullanici ==dizi[i]){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("Bulunamadı");
    }
}
