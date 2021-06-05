/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b.
Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            System.out.println("Какие числа делить?: ");
            Scanner sc = new Scanner(System.in);
            int a;
            int b, c;
            b = sc.nextInt();
            c = sc.nextInt();
            a = b % c;
            if (a == 0) {
                System.out.println("Делится");
            }   else  {
                System.out.println("Делится с остатком " + a);
            }
        }
}

