package sigmoid;

public class SigmoidTwo {
    // Пример использование методов отличных от типа void
    // s(x) = 1 / ( 1 + e^(-x))

    public SigmoidTwo(double x){

        // самый простой сценарий с созданием промежуточных перменных
//        double result1 = neg(x);
//        double result2 = pow(result1);
//        double result3 = sum(result2);
//        double result4 = div(result3);


        // s(x) = 1 / ( 1 + e^(-x))
        double result4 = div(sum(pow(neg(x)))); //  строчная форма
//                div(
//                        sum(
//                                pow(
//                                        neg(
//                                                x
//                                        )
//                                )
//                        )
//                );


          printResult(result4);
    }

    private double neg(double x){
        //double result = x * (-1);      сократили код(отформатировали)
        return x * (-1);
    }

    private double pow(double q){
        //double result = Math.pow(Math.E,q);
        return Math.pow(Math.E,q);
    }

    private double sum(double w){
        //double result = 1 + w;
        return 1 + w;
    }

    private double div(double e){
        //double result = 1 / e;
        return 1 / e;
    }

    private void printResult(double t){
        System.out.println("SigmoidTwoResult = " + t);
    }
}
