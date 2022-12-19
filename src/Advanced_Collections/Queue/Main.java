package Advanced_Collections.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 5, 6, 8, 3);

        Queue<Integer> queue = new ArrayDeque<>();

        for (Integer element : list) {
            System.out.println("queue.offer element: " + element + ": " + queue.offer(element));
            System.out.println(queue);
        }


        int size = queue.size();

        for (int i = 0; i <= size; i++) {
            System.out.println("queue.peek: " + queue.peek());
            System.out.println("queue: " + queue);
            System.out.println("queue.poll: " + queue.poll());
            System.out.println("queue: " + queue);
        }

    }
}
