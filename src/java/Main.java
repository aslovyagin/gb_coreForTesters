import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        AppData appData = new AppData();
        appData.loadData("src/data.txt");

        System.out.println(Arrays.deepToString(appData.getData()).replace("], ", "]\n"));

        //appData.saveData("src/dataNew.txt");

    }
}
/*
Реализовать сохранение данных в csv файл;
Реализовать загрузку данных из csv файла. Файл читается целиком.
 */