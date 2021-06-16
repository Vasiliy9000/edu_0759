/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(sub());
        System.out.println(sub());
    }

    public static boolean sub() {
        System.out.println("Укажите числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return (a == b); // System.out.println(a == b); var result = a - b; return result;
    }
}

