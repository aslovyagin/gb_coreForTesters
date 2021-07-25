package lesson3;

import lesson3.fruits.Fruit;

import java.math.BigDecimal;
import java.util.Arrays;

public class Box<T extends Fruit> {
    T[] fruits;

    public Box(T[] fruits) {
        this.fruits = fruits;
    }

    public float getWeight() {
        float sum = 0;
        for (T t : fruits) {
            sum += t.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> box) {
        return new BigDecimal(this.getWeight()).equals(new BigDecimal(box.getWeight())) ? true : false;
    }

    public void addFruit(T fruit) {
        fruits = Arrays.copyOf(fruits, fruits.length + 1);
        fruits[fruits.length - 1] = fruit;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + Arrays.toString(fruits) +
                '}';
    }

    public void changeBox(Box<T> box) {
        box.fruits = Arrays.copyOf(fruits, fruits.length);
        fruits = Arrays.copyOf(fruits, 0);
    }
}