package Lesson6;

import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//        Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
public class main {
    public static void main(String[] args) {


        Set<Laptop> set = new HashSet<>();
        Laptop laptop1 = new Laptop("ASUS", 8, 256, 15.6, "Black", 1000);
        Laptop laptop2 = new Laptop("Lenovo", 8, 1024, 15.6, "White ", 1000);
        Laptop laptop3 = new Laptop("Dell", 16, 256, 15, "Black", 1200);
        Laptop laptop4 = new Laptop("Sony", 32, 256, 15.6, "Black", 1100);
        Laptop laptop5 = new Laptop("Toshiba", 8, 512, 17.3, "White ", 1000);
        Laptop laptop6 = new Laptop("Lenovo", 32, 1024, 15, "Red", 900);
        Laptop laptop7 = new Laptop("Dell", 16, 1024, 17.3, "Black", 1500);
        Laptop laptop8 = new Laptop("ASUS", 16, 512, 15.6, "White ", 2000);
        Laptop laptop9 = new Laptop("Sony", 8, 512, 15.6, "Black", 950);
        Laptop laptop10 = new Laptop("ASUS", 32, 512, 17.3, "Red", 1150);

        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);
        set.add(laptop5);
        set.add(laptop6);
        set.add(laptop7);
        set.add(laptop8);
        set.add(laptop9);
        set.add(laptop10);


        Map<String, Object> criteria   = new HashMap<>();
            Scanner iScaner = new Scanner(System.in);
            int n = 0;
        while (n != 7) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n 1 - Производитель\n 2 - Оперативная память\n 3 - Жесткий диск\n 4 - Размер монитора\n 5 - Цвет\n 6 - Цена\n 7 - Начать поиск\n" );
             n = iScaner.nextInt();

    if (n == 1) {
        System.out.println("Введите название производителя ASUS, Lenovo, Dell, Sony, Toshiba: ");
        String manufacturer = iScaner.toString();
        criteria.put("manufacturer", manufacturer);
    }

    if (n == 2) {
        System.out.println("Введите количество RAM: ");
        int RAM = iScaner.nextInt();
        criteria.put("RAM", RAM);
    }

    if (n == 3) {
        System.out.println("Введите объем HDD: ");
        int HDD = iScaner.nextInt();
        criteria.put("HDD", HDD);
    }

    if (n == 4) {
        System.out.println("Введите размер экрана(15, 15.6 , 17.3): ");
        int screen = iScaner.nextInt();
        criteria.put("screen", screen);
    }

    if (n == 5) {
        System.out.println("Введите цвет  (Black, Red, Whit): ");
        String color = iScaner.toString();
        criteria.put("color", color);
    }

    if (n == 6) {
        System.out.println("Введите минимальную стоимость: ");
        int price = iScaner.nextInt();
        criteria.put("price", price);
    }

}





    Set<Laptop> matchingLaptops = new HashSet<>();
        for (Laptop laptop : set) {
        if (checkCriteria(laptop, criteria)) {
            matchingLaptops.add(laptop);
        }
    }


        System.out.println("Результаты поиска:");
        for (Laptop laptop : matchingLaptops) {
        System.out.println(laptop);
    }




    }

    private static boolean checkCriteria(Laptop laptop, Map<String, Object> criteria) {
        if (criteria.containsKey("manufacturer") && !laptop.getManufacturer().equalsIgnoreCase((String) criteria.get("manufacturer"))) {
            return false;
        }

        if (criteria.containsKey("RAM") && laptop.getRAM() < (int) criteria.get("RAM")) {
            return false;
        }

        if (criteria.containsKey("HDD") && laptop.getHDD() < (int) criteria.get("HDD")) {
            return false;
        }

        if (criteria.containsKey("screen") && laptop.getScreen() != (double) criteria.get("screen")) {
            return false;
        }

        if (criteria.containsKey("color") && !laptop.getColor().equalsIgnoreCase((String) criteria.get("color"))) {
            return false;
        }

        if (criteria.containsKey("price") && laptop.getPrice() < (int) criteria.get("price")) {
            return false;
        }

        return true;
    }
}
