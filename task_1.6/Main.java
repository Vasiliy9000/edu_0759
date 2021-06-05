/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Астрологи предсказали неделю увеличеных чисел!");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        double b = a * 1.15;
        System.out.println("Числа увеличились 15%! " + b);
    }
}

      //  int number = scan.nextInt();