package Arithmetic;
import static java.lang.Math.*;
//Вычислите значение выражения (x+1)2+3(x+1) при а) x=1.7; б) x=3

public class task10 {
    public static void main(String[] args) {
        double x  = 3;
    double result = pow(x + 1, 2) + 3 * (x + 1);
    System.out.println(result);
    }
}
