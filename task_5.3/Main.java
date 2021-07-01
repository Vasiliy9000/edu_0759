/*
* Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
* Коллекции вы создаёте сами
*/

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new  ArrayList<>();
        ArrayList<Integer> arr2 = new  ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++){
            arr1.add(r.nextInt(50));
        }
        for (Integer j : arr1){
            if(j > 0 && j < 10)
                arr2.add(j);
        }
        System.out.println(arr2);
    }
}