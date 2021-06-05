/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 4, 6 };
        int no = arr.length;
        for(int a = 0; a < arr.length; a++) {
            if (arr[a] == 5){
                System.out.println("да");
            } else if (a == (no - 1) ) {
                System.out.println("нет");
            }
        }
    }
}
