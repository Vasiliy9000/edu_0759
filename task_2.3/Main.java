/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/

public class Main {
    public static void main(String[] args) {
        int a = 7;
        for (int b = 0; b < 9; b++ ) {
            for (int c = 0; c < b; c++ ) {
                System.out.print(a);
            }
        System.out.println();
        }
    }
}

