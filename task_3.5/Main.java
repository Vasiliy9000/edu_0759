/*
Задание: Дан массив с числами.
Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/

public class Main {
    public static void main(String[] args) {
        int num[] = {4, 2, 6, 2, 65};
        rec(0, num);
    }

    public static void rec(int n, int[] arr){
        System.out.println(arr[n]);
        if(n < (arr.length-1)) {
            rec(n+1, arr);
        }
    }

}


