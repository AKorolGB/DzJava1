package Lesson5;
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        Map<String, List<String>> phoneBook = new HashMap<>();
//
//
//        phoneBook.put("Иван", new ArrayList<>());
//        phoneBook.get("Иван").add("123456789");
//        phoneBook.get("Иван").add("987654321");
//
//        phoneBook.put("Анна", new ArrayList<>());
//        phoneBook.get("Анна").add("111111111");
//        phoneBook.get("Анна").add("222222222");
//        phoneBook.get("Анна").add("333333333");
//
//        phoneBook.put("Ольга", new ArrayList<>());
//        phoneBook.get("Ольга").add("131561651");
//
//        phoneBook.put("Павел", new ArrayList<>());
//        phoneBook.get("Павел").add("111111111");
//        System.out.println(phoneBook);
//    }
//    }

        Map<String, List<String>> phoneBook = new HashMap<>();

        addPhone(phoneBook, "Иван", "123456789");
        addPhone(phoneBook, "Иван", "987654321");
        addPhone(phoneBook, "Анна", "111111111");
        addPhone(phoneBook, "Анна", "222222222");
        addPhone(phoneBook, "Анна", "333333333");
        addPhone(phoneBook, "Ольга", "131561651");
        addPhone(phoneBook, "Павел", "165181656");
        System.out.println(phoneBook);
    }

    public static void addPhone(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phoneNumber);
    }

}







