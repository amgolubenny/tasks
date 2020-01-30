package Arithmetic;
import static java.lang.Math.*;
//Вычислите |x|+x5, если x=−2

public class task9 {
    public static void main(String[] args) {
    int x = -2;
    double result = abs(x) + pow(x,5);
    System.out.println(result);
    }
}
