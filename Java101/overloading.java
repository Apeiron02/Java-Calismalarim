public class overloading {
    static void print(){
        System.out.println("Parametresiz metot");
    }
    static void print(int a){
        System.out.println("Parametremiz:"+a);

    }
    static int print(int a,int b){
        return a+b;

    }
    static int print(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        print();
        print(6);
        System.out.println(print(5,6));
        System.out.println(print(5,6,9));
    }
}
