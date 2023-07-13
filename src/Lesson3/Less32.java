package Lesson3;

import java.util.*;

//Задан целочисленный список ArrayList.
//        Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
public class Less32 {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNambers(10,1,100);
        System.out.println(numbers);
        int max = Collections.max(numbers);
        System.out.println("Максимальное число: " + max);
        int min = Collections.min(numbers);
        System.out.println("Минимальное число: " + min);
        double average = arithmeticalMean(numbers);
        System.out.println("Среднее арифметическое: " + average);
    }


    public static List<Integer> generateRandomNambers (int count,int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i < count; i++){
            int randomNumber = random.nextInt(max - min + 1) + min;
            numbers.add(randomNumber);
        }
        return numbers;
    }

    public static double arithmeticalMean(List<Integer> numbers){
        int sum = 0;
        int leng = numbers.size();
        for (int number : numbers){
            sum = sum + number;
        }
        return (double) sum/leng;
    }
}
