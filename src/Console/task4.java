package Console;

//Вывести на экран прямоугольник, заполненный буквами А.
// Количество строк в прямоугольнике равно 5,
// количество столбцов равно 8.
public class task4 {
    public static void main(String[] args) {
        String s = "A";
        for (int i = 0; i < 5; i++){
            System.out.print(s);
            for (int n = 0; n < 8; n++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
