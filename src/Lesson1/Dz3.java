package Lesson1;//2) Вывести все простые числа от 1 до 1000



public class Dz3 {
    public static void main(String[] args) {
        for (int n = 2; n <= 1000; n++) {
            boolean simple = true;


            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    simple = false;
                    break;
                }
            }


            if (simple) {
                System.out.println(n);
            }
        }
    }
}
