package utils;

import exeptions.*;

public class ArrayUtils {
    public static int summ(String[][] mass) throws MyArraySizeException, MyArrayDataException {
        checkDim(mass);
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                try {
                    sum += Integer.parseInt(mass[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверное число в ячейке [" + i + "] [" + j + "]");
                }
            }
        }
        return sum;
    }

    public static void checkDim(Object[][] mass) throws MyArraySizeException {
        if (mass.length != 4) {
            throw new MyArraySizeException("Первый разряд равен " + mass.length);
        } else {
            for (int i = 0; i < mass.length; i++) {
                if (mass[i].length != 4) {
                    throw new MyArraySizeException("Второй разряд " + mass[i].length);
                }
            }
        }
    }
}
