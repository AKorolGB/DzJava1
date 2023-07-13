package Lesson1;//3) Реализовать простой калькулятор


import java.util.Scanner;


public class Dz2 {
    public static void main(String[] args){
        Scanner iScaner = new Scanner(System.in);
        System.out.println("Введите превое число: ");
        float num1 = iScaner.nextFloat();
        System.out.println("Введите второе число: ");
        float num2 = iScaner.nextFloat();
        float res;
        System.out.println("Выберите операцию:\n 1.Умнажение\n 2.Деление\n 3.Сложение\n 4.Вычетание\n");
        int operation = iScaner.nextInt();
        while (operation > 4 || operation < 1){
            System.out.println("Ошибка\n Выберите операцию:\n 1.Умнажение\n 2.Деление\n 3.Сложение\n 4.Вычетание\n");
            operation = iScaner.nextInt();
        }
        if (operation == 1){
            res = num1 * num2;
            System.out.println("Результат: "+res);
        }
        else if (operation == 2){
            if (num2 == 0){
                System.out.println("Ошибка.Делениен на ноль невозможно!");
            }
            res = num1 / num2;
            System.out.println("Результат: "+res);
        }
        else if (operation == 3){
            res = num1 + num2;
            System.out.println("Результат: " +res);
        }
        else if (operation == 4){
            res = num1 - num2;
            System.out.println("Результат: " +res);
        }
    }
}
