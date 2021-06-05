/*
Задание: Дан массив с элементами [2, 3, 4, 5].
С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 4, 5 };
        int sum = 0;
        for(int a = 0; a < arr.length; a++) {
            System.out.println(sum = sum + arr[a]);
        }
    }
}
