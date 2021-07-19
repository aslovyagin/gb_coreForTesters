import exeptions.MyArrayDataException;
import exeptions.MyArraySizeException;
import utils.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        String[][] mass = {{"1", "s", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            System.out.println(ArrayUtils.summ(mass));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}