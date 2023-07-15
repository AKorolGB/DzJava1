package Lesson4;
//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNambers(10,1,10);
        System.out.println(numbers);
        System.out.println(calculateSum(numbers));
        System.out.println(calculateSumIterator(numbers));
    }

    public static List<Integer> generateRandomNambers (int count,int min, int max) {
        List<Integer> numbers = new LinkedList<>();
        Random random = new Random();

        for (int i = 1; i < count; i++){
            int randomNumber = random.nextInt(max - min + 1) + min;
            numbers.add(randomNumber);
        }
        return numbers;
    }

    public static int calculateSum(List<Integer> numbers){
        int sum = 0;
                for (Integer number: numbers){
                 sum = sum + number;
            }
        return sum;
    }

    public static int calculateSumIterator(List<Integer> numbers) {
        int sum = 0;
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int element = iterator.next();
            sum += element;
        }
        return sum;
    }
}
