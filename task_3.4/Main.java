/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если их сумма больше 10 - пусть функция вернет true, а если нет - false.

*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(sub());
        System.out.println(sub());
    }
        static boolean sub() {
            System.out.println("Укажите числа");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a + b > 10) {
                return true;
            } else {
                return false;
            }
        }
    }
