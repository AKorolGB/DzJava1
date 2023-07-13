package Lesson3;//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке. Collections.frequency(list, item)

import java.util.*;

public class Les33 {
    public static void main(String[] args) {
        List<String> planet = new ArrayList<>();
        planet.add("Меркурий");
        planet.add("Меркурий");
        planet.add("Венера");
        planet.add("Земля");
        planet.add("Марс");
        planet.add("Юпитер");
        planet.add("Сатурн");
        planet.add("Уран");
        planet.add("Нептун");
        planet.add("Венера");
        planet.add("Меркурий");
        planet.add("Земля");
        planet.add("Земля");
        planet.add("Марс");
        planet.add("Марс");
        planet.add("Марс");
        planet.add("Сатурн");
        planet.add("Уран");
        planet.add("Нептун");
        planet.add("Уран");
        System.out.println(planet);

        Set<String> distinct = new HashSet<>(planet);
        for (String s: distinct) {
            System.out.println(s + ": " + Collections.frequency(planet, s));
        }
    }
}
