public class dizielemanlarinitoplama {
    public static void main(String[] args) {
        int dizi[]={12,3,56,34,76,85,34,42};
        int toplam =0;
        for (int i =0 ; i<dizi.length;i++){
            toplam=dizi[i]+ toplam;
        }
        System.out.println(toplam);
    }
}
