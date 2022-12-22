import java.util.Random;

public class dizimindeger {
    public static void main(String[] args) {
        Random sayi = new Random();
        int[] dizi = new int[10];


        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = sayi.nextInt(101);
        }
        int min =dizi[0];

        for (int j = 1; j < dizi.length; j++) {
            if (min > dizi[j]) {
                    min = dizi[j];

            }
        }



        System.out.println(java.util.Arrays.toString(dizi));
        System.out.println(min);

    }
}
