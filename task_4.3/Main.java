/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {
        Cat kat1 = new Cat();
        Cat kat2 = new Cat();

        kat1.setAge(3);
        kat1.setWeight(5);
        kat1.setStrength(3);

        kat2.setAge(2);
        kat2.setWeight(2);
        kat2.setStrength(8);


        kat1.fight(kat2);
        kat2.fight(kat1);
        kat2.fight(kat2);
    }
}
class Cat {
    public int age;
    public int weight;
    public int strength;

    public void setStrength(int name) { this.strength = name; }

//    public int getStrength() { return strength; }

    public void setAge(int age) { this.age = age; }

//    public int getAge() { return age; }

    public void setWeight(int weight) { this.weight = weight; }

//    public int getWeight() { return weight; } int kat2 = 0;

    public Cat() {

    }

    public void fight(Cat anotherCat) {
        int kat = 0;
        int another = 0;

        if (this.weight > anotherCat.weight) {
            kat ++;
        }  if (this.weight < anotherCat.weight) {
            another ++;
        }  if (this.strength > anotherCat.strength) {
            kat++;
        }  if (this.strength < anotherCat.strength) {
            another++;
        }  if (this.age > anotherCat.age) {
            kat++;
        }  if (this.age < anotherCat.age) {
            another++;
        }  if (kat < another) {
            System.out.println("Приглашенный кот, оказался покрепче...");
        }  else if (kat > another) {
            System.out.println("Приглашенный кот, повержен!");
        }  else { System.out.println("Кошачий паритет"); }

    }
}


