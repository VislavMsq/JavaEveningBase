package operators;

public class LogicOperators {
    public static void main(String[] args) {
        int q = 10;
        int w = 20;
        int e = 30;
        int r = 40;

        //                                              true
        //                                true
        //                     true
        //                    !false                          false
        //               false      false        true         !true
        boolean test = ((q > w) && (w > r)) || ((r > q)) || !(e < r);
        System.out.println(test);



        //                                                   true
        //                                             true        true
        System.out.println("(q < w) && (e < r) = " + ((q < w) && (e < r)));     // лог. оператор - И

        //                                                  false
        //                                             true       false
        System.out.println("(q < w) && (e > r) = " + ((q < w) && (e > r)));     // лог. оператор - И

        //                                                   true
        //                                             true       false
        System.out.println("(q < w) || (e > r) = " + ((q < w) || (e > r)));     // лог. оператор - ИЛИ

        //                                                   false
        //                                             false      false
        System.out.println("(q > w) || (e > r) = " + ((q > w) || (e > r)));     // лог. оператор - ИЛИ

        //                                                    !(false)   знак ! разворачивает резулттат на противоположный
        //                                                      true
        //                                                 true       false
        System.out.println("!((q < w) || (e > r)) = " + !((q < w) || (e > r))); // ! знак НЕ, разворачивает выражение

        //                                                      !(true)   знак ! разворачивает резулттат на противоположный
        //                                                       false
        //                                                 false       false
        System.out.println("!((q > w) || (e > r)) = " + !((q > w) || (e > r))); // ! знак НЕ, разворачивает выражение


    }
}
