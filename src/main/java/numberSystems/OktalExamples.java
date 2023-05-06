package numberSystems;

public class OktalExamples {
    public static void main(String[] args) {
        // перевод из десятичной в восьмеричную систему
        int q = 296;

        System.out.println(296 / 8);   // 37
        System.out.println(296 % 8);            // 0

        System.out.println(37 / 8);   // 4
        System.out.println(37 % 8);             // 5

        System.out.println(4 / 8);   // 0 <- встречаем 0 и останавливаемся
        System.out.println(4 % 8);              // 4

        // перевод из 10-й в 8-ю сисьтему (10 -> 8) (short way)
        System.out.println("short way 10 -> 8 = " + Integer.toOctalString(q));

        // перевод из 8-й в 10-ю сисьтему (8 -> 10) (short way)
        // 450 - значение в 8-й сисьтеме
        int q8 = 0450;


        // перевод из 8-й в 10-ю сисьтему (8 -> 10) (classic way)
        System.out.println(4 * Math.pow(8, 2) + 5 * Math.pow(8, 1) + 0 * Math.pow(8, 0));
        System.out.println(q8);




    }
}
