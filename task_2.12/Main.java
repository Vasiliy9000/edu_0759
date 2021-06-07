/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

int[] arr = new int[]{2, 3, 5, 6, 4, 6, 6};
        for (int a = 0; a < arr.length-1; a++) {
            if (arr[a] == arr[a+1]) {
                System.out.print("Да");
            } else if (a == arr.length-2) {
                System.out.print("нет");
            } else {
                continue;
            }
        }

*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Количество цифр в массиве? ");
        int size = num.nextInt();
        int arr[] = new int[size];
        System.out.println("Введите по очереди количество цифр которое указали. ");
        for (int i = 0; i < size; i++) {
            arr[i] = num.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print (" " + arr[i]); // Выводим на экран, полученный массив
        }
    }
}
