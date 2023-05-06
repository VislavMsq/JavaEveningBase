package sigmoid;

public class SigmoidInit {
    public static void main(String[] args) {

        // s(x) = 1 / ( 1 + e^(-x))
        double x = 2.5;


        SigmoidOne sigmoidOne = new SigmoidOne(x);

        SigmoidTwo sigmoidTwo = new SigmoidTwo(x);



        // test
        System.out.println("Sigmoid test result = " + (1 / (1 + Math.pow(Math.E, -x))));


    }
}
