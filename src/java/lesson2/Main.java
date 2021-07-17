import exeptions.*;
import utils.ArrayUtils;

public class Main {

    public static void main(String[] args) {
        String[][] array = {{"1", "s", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            System.out.println(ArrayUtils.summ(array));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
1. Написать метод, на вход которому подается двумерный строковый массив размером 4х4. При подаче массива другого размера
необходимо бросить исключение MyArraySizeException.

2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе
преобразование не удалось (например, если в ячейке лежит символ или текст вместо числа), надо бросить исключение
MyArrayDataException с детализацией, в какой ячейке неверные данные.

3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException
и вывести результат расчета.
 */