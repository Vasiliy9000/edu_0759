/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
 чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 0, 1, 4, 6, 6};
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            int count = 1;
            sum = sum + arr[a];
            if (sum > 10) {
                count = count + a;
                System.out.println(count);
                break;
            }
        }
    }
}
