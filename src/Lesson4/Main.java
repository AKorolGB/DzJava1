package Lesson4;
//Пусть дан LinkedList с несколькими элементами.
//        Реализуйте метод, который вернет “перевернутый” список.
//        Постараться не обращаться к листу по индексам.
import java.util.LinkedList;

public class  Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
          list.add("Понедельник");
          list.add("Вторник");
          list.add("Среда");
          list.add("Четверг");
          list.add("Пятница");
          list.add("Суббота");
          list.add("Воскресенье");
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>();
        for (String number: list){
            list2.push(number);
        }
        System.out.println(list2);
    }



}
