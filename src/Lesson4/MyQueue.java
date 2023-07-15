package Lesson4;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue<Integer> queue = new LinkedList<>();

  Queue<Integer> enqueue(int item){

       queue.offer(item);
       return queue;
    }
    int dequeue() {
     int a = queue.poll();
     return a;

    }

    int first() {
      int a =  queue.peek();
      return a;
    }

    void printQueue() {
        System.out.println();
        Object[] arr = queue.toArray();
        for (Object item : arr) {

        }
        System.out.println(queue);
    }
}
