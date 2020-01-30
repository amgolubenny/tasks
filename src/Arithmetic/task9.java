package Arithmetic;
//Вычислите |x|+x5, если x=−2
import java.lang.Math;

public class task9 {
    public static void main(String[] args) {
    int x = -2;
    double result = Math.abs(x) + Math.pow(x,5);
    System.out.println(result);
    }
}
