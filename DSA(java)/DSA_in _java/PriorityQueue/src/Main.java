import java.awt.desktop.QuitResponse;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Priority Queue = A FIFO data structure that serves elements with the highest priorities first before elements with lower priority.

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.1);
        queue.offer(4.3);
        queue.offer(4.3);
        queue.offer(1.3);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());

        }
        // Comparator
        //System.out.println(Collections.reverseOrder());

    }
}