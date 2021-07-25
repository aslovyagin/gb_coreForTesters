package lesson3;

import lesson3.fruits.*;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(6);
        Apple apple1 = new Apple(5);
        Apple apple3 = new Apple(1);

        Orange orange = new Orange(3);
        Orange orange1 = new Orange(6);

        Box<Orange> orangeBox = new Box<>(new Orange[]{orange});
        Box<Apple> appleBox = new Box<>(new Apple[]{apple});
        //проверка добавления
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange1);
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple3);
        System.out.println(appleBox);
        System.out.println(orangeBox);
        //проверка подсчета веса
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        //проверка сравнения
        System.out.println(orangeBox.compare(appleBox));
        //проверка переброса фруктов
        Box<Apple> newAppleBox = new Box<>(new Apple[]{});
        System.out.println(appleBox);
        appleBox.changeBox(newAppleBox);
        newAppleBox.addFruit(apple);
        System.out.println(appleBox);
        System.out.println(newAppleBox);

        //

    }
}
/*
Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
Даны классы: Fruit, Apple extends Fruit, Orange extends Fruit.
--- Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку
нельзя сложить и яблоки, и апельсины;
--- Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока –
1.0f, апельсина – 1.5f (единицы измерения не важны);
--- Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в
compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с
яблоками и апельсинами;
--- Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов:
нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую
перекидываются объекты, которые были в первой;
--- Не забываем про метод добавления фрукта в коробку.
 */