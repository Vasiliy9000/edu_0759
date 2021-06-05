/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Что у вас по деньгам и какой хотите процент? ");
        int b, c;
        b = money.nextInt();
        c = money.nextInt();
        for (int a = 0; a < 6; a++) {
            b = (b * c * 1)/100+b;
            System.out.println(b);
        }
    }
}

