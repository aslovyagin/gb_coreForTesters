package lesson3;

public class Utils {
    public static void swapArr(Object[] arr, int a, int b) {
        Object tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}