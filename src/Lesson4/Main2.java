package Lesson4;



//Реализуйте очередь с помощью LinkedList со следующими методами: enqueue()enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
public class Main2 {
    public static void main(String[] args) {
        MyQueue stack = new MyQueue();
        stack.enqueue(1);
        stack.enqueue(2);
        stack.enqueue(5);
        stack.enqueue(5);
        stack.enqueue(5);
        stack.enqueue(5);
        stack.printQueue();
        System.out.println(stack.dequeue());
        stack.printQueue();
        stack.first();
        System.out.println(stack.first());
        stack.printQueue();
        stack.enqueue(1);
        stack.printQueue();

    }


}
