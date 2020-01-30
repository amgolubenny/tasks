package Arithmetic;
import static java.lang.Math.*;
//Вычислите значение выражения ((|x−5|−sinx)/3) + √(x^2+2014) * cos2*x − 3 при x=−2.34
// Задача 11 на сайте http://www.itmathrepetitor.ru/prog/zadachi-na-vychisleniya/

public class task11 {
    public static void main(String[] args) {
        double x = -2.34;
        double result = (abs(x - 5) - sin(x)) / 3 + sqrt(pow(x,2) +2014) * cos(2 * x) -3;
        System.out.println(result);
    }
}
