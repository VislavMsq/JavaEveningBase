package numberSystems;

public class HexExamples {
    public static void main(String[] args) {
        int q = 296;

        // перевод из 10-й -> 16-ю
        System.out.println(296 / 16);     // 18
        System.out.println(296 % 16);         // 8

        System.out.println(18 / 16);      // 1
        System.out.println(18 % 16);          // 2

        System.out.println(1 / 16);       // 0  <- встретили 0 и остановились
        System.out.println(1 % 16);           // 1

        // результат - 128

        // перевод из 10-й в 16-ю сисьтему (10 -> 16) (short way)
        System.out.println("short way 10 -> 16 = " + Integer.toHexString(q));

        // перевод из 16-й -> 10-ю (classic way)
        System.out.println(1 * Math.pow(16, 2) + 2 * Math.pow(16, 1) + 8 * Math.pow(16, 0));

        // перевод из 16-й -> 10-ю (short way)
        int q16 = 0x128;
        System.out.println(q16);

        int q16s = 0x13B;
        System.out.println(q16s);


    }
}
