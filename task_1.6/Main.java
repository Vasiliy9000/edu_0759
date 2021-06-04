/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введенное число увеличится на 15%!");
        double num1 = num + 1.15;
        System.out.println(num1);
    }
}
