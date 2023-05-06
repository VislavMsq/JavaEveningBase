package ifelseoperators;

public class Example3 {
    public static void main(String[] args) {
        // например, если у нас будет хорошая погода, то мы поедем за город, при этом
        // если останется время - покатаемся на лошади

        boolean freeTime = true;
        boolean goodWeather = true;

        if (goodWeather) {
            System.out.println("поедем за город");
        } if (freeTime){
            System.out.println("езда на лошади");
        }

        if (goodWeather && freeTime){
            System.out.println("поедем за город");
            System.out.println("езда на лошади");
        }

    }
}
