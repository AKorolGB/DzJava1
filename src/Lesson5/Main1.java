package Lesson5;

//Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова,
//        Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов,
//        Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
//        Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
//        Написать программу, которая найдет и выведет повторяющиеся
//        имена с количеством повторений. Отсортировать по убыванию
// популярности. Для сортировки использовать TreeMap.
import java.util.*;

public class Main1 {

    public static void main(String[] args) {



        List<String> employees = Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Иванов", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Мусина",
                "Иван Мечников", "Петр Петин", "Иван Иванов");

        List<String> firstNames = new ArrayList<>();
        for (String employee : employees) {
            String[] parts = employee.split(" "); // Разделяем имя и фамилию по пробелу
            if (parts.length == 2) {
                String firstName = parts[0];
                firstNames.add(firstName);
            }
        }
        System.out.println(firstNames);
        HashMap<String, Integer> nameCount = new HashMap<>();
        for (String name : firstNames) {
            nameCount.merge(name, 1, Integer::sum);
        }
        Map<Integer, List<String>> reversed = new TreeMap<>(Comparator.reverseOrder());

        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (!reversed.containsKey(count)) {
                reversed.put(count, new ArrayList<>());
            }
            reversed.get(count).add(name);
        }

        for (Map.Entry<Integer, List<String>> entry : reversed.entrySet()) {
            int count = entry.getKey();
            List<String> namesWithCount = entry.getValue();
            if (count > 1) {
                System.out.println(count + ": " + namesWithCount);
            }
        }
    }

}
