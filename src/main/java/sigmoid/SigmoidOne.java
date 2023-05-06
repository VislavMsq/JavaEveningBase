package sigmoid;

public class SigmoidOne {
    // Пример использование методов типа void
    // s(x) = 1 / ( 1 + e^(-x))

    // neg - умножение на -1, pow - возведение в степень, sum - сложение, div - деление

    public double result1, result2, result3,result4;

    public SigmoidOne(double x) {
        neg(x);
        pow();
        sum();
        div();

        printResult();

    }

    private void neg(double x) {
        result1 = x * (-1);
    }

    private void pow() {
        result2 = Math.pow(Math.E, result1);
    }

    private void sum() {
        result3 = 1 + result2;
    }

    private void div() {
        result4 = 1 / result3;
    }

    private void printResult() {
        System.out.println("SigmoidOneReslt = " + result4);
    }
}
