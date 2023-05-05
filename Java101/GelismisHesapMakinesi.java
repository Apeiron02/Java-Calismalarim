import java.util.Scanner;
public class GelismisHesapMakinesi {
    static void plus(){
        Scanner giris= new Scanner(System.in);
        int sayi , toplam =0 , i=1;
        while (true){
            System.out.print(i++ +".Sayı:");
            sayi = giris.nextInt();
            if(sayi ==0){
                break;
            }
            toplam += sayi;
        }
        System.out.println("Sonuç:"+toplam);

    }
    static void minus(){
        Scanner giris= new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz");
        int sayi = giris.nextInt();
        int toplam = 0;
        for(int i =1 ;i<=sayi; i++){
            System.out.print(i + ".Sayı :");
            int sayi2= giris.nextInt();
            if(i ==1){
                toplam +=sayi2;
                continue;
            }
            toplam -=sayi2;

        }
        System.out.println("Sonuç:"+toplam);
    }
    static void times(){
        Scanner giris = new Scanner(System.in);
        int sayi,carpim=1;
        System.out.println("1'e basarsanız çıkış yapılır.");
        while (true){

            System.out.print("Değer giriniz:");
            sayi = giris.nextInt();
            if(sayi ==0){
                carpim =0;
                break;
            }
            if (sayi ==1){
                break;
            }
            carpim *=sayi;
        }
        System.out.println("Sonuç = "+carpim);
    }
    static void divided(){
        Scanner giris = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz:");
        int sayi = giris.nextInt();
        double deger = 0.0;
        for(int i =1;i<=sayi; i++){
            System.out.print(i +".Sayı:");
            double sayi2= giris.nextDouble();
            if(i !=1 && sayi2 ==0){
                System.out.println("Böleni 0 giremezsin.");
                continue;
            }
            if(i==1){
                deger = sayi2;
                continue;
            }
            deger /=sayi2;
        }
        System.out.println("Sonuç:"+ deger);

    }
    static void power(){
        Scanner giris =new Scanner(System.in);
        System.out.print("Taban değer giriniz:");
        int taban = giris.nextInt();
        System.out.print("Üst değerini giriniz:");
        int ust = giris.nextInt();
        int carpim = 1;
        for (int i =1 ;i<=ust;i++){
            carpim *=taban;
        }
        System.out.println("Sonuç: "+carpim);
    }
    static void factorial(){
        Scanner giris =new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı giriniz:");
        int sayi =giris.nextInt();
        int carpim =1;
        for (int i = 1;i<=sayi;i++){
            carpim *=i;
        }
        System.out.println(sayi+" Sayısının faktöriyeli: "+carpim);
    }
    static void mod(){
        Scanner giris =new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz:");
        int sayi1= giris.nextInt();
        System.out.print("2.Sayıyı Giriniz:");
        int sayi2= giris.nextInt();
        double mod = sayi1 % sayi2;
        System.out.println("Sonuç;"+mod);

    }
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        int select;
        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                0- Çıkış Yap""";
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz:");
            select= giris.nextInt();
            switch (select) {
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> times();
                case 4 -> divided();
                case 5 -> power();
                case 6 -> factorial();
                case 7 -> mod();
                case 0 -> System.out.println("Çıkış Yapılıyor...");
                default -> System.out.println("Yanlış bir değer girdiniz,tekrar giriniz.");
            }
        }
        while (select!=0);
    }
}
