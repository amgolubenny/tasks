package Console;

//Вывести на экран пять строк из нулей,
//причем количество нулей в каждой строке равно номеру строки
public class task3 {
    public static void main(String[] args) {
        String s = "0";
        for (int i = 0; i < 5; i++){
            System.out.println(s);
            s = s + "0";
        }
    }
}