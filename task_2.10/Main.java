/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
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
    }
}
