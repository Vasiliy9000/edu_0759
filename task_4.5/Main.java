/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {

        class Animal {
            int legs = 4;
            int tails = 1;
        }

        class Horse extends Animal {
            private void run() {
                System.out.println("Игого, я поскакал(а)");
            }

        }

        class Pegasus extends Horse {
            public void fly() {
                System.out.println("Игого, я полетел(а)");
            }
        }

        Pegasus peg = new Pegasus();
        Horse hor = new Horse();
        hor.run();
        peg.fly();
    }
}
