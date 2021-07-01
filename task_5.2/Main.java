/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/* 
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> states = new HashMap<String, String>();

        while (true) {
            System.out.println("Введите город ");
            String family = scanner.nextLine();
            System.out.println("Введите семью ");
            String city = scanner.nextLine();
            if (family.isEmpty()) {
                System.out.println("В каком городе ищите? ");
                String gor = scanner.next();
                String first = states.get(gor);
                System.out.println("Там живет " + first);
                break;
            }
            states.put(family,city);
            System.out.println(states);
        }
    }
}