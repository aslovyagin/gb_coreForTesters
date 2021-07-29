package Utils;

import java.util.HashMap;
import java.util.Map;

public class UtilClass {

    public static HashMap<String, Integer> countWords(String[] words) {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        return wordsMap;
    }

    public static void showMap(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> key : map.entrySet()) {
            System.out.println(key.getKey() + " " + key.getValue());
        }
    }
}