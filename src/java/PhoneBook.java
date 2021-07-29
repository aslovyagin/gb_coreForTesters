import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class PhoneBook {

    private static PhoneBook INSTANCE;
    private HashMap<String, HashSet<String>> book;

    private PhoneBook() {
        book = new HashMap<>();
    }

    public static PhoneBook getInstance() {
        if (INSTANCE == null) {
            synchronized (PhoneBook.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PhoneBook();
                }
            }
        }
        return INSTANCE;
    }

    public void add(String name, String number) {
        Set<String> numSet = new HashSet<>();

        if (this.book.containsKey(name)) {
            numSet = this.book.get(name);
            numSet.add(number);
            this.book.put(name, (HashSet<String>) numSet);
        } else {
            numSet.add(number);
            this.book.put(name, (HashSet<String>) numSet);

        }

    }

    public String get(String name) {
        String listOfPhones = "";

        if (this.book.containsKey(name)) {
            listOfPhones = "Телефон(ы):" + book.get(name);
        } else {
            listOfPhones = "Такого клиента нет в справочнике";
        }
        return listOfPhones;
    }
}