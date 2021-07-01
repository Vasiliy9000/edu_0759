/*
* Дана коллекция имён.
* 1) удалить все повторяющиеся имена из коллекции
* 2) вывести коллекцию на экран
* */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");

        for (int i = 0; i < names.size(); i++){
            for (int a = 0; a < names.size(); a++){
                if ( names.get(i) == names.get(a) && i != a ) {
                    names.remove(a);
                    System.out.println(names);
                }
            }
        }
    }
}
