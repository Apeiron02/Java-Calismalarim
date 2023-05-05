
public class Sayipalidrommu {
    static boolean isPalidrom(int number) {
        int temp = number, reversNumber = 0, LastNumber;
        while (temp != 0) {
            LastNumber = temp % 10;
            reversNumber = (reversNumber * 10) + LastNumber;
            temp /= 10;
        }
            if (reversNumber == number)
                return true;

            else
                return false;

        }

    public static void main(String[] args) {

        System.out.println(isPalidrom(123));

    }
}
