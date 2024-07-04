import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Queue = FIFO data structure. First In First Out .
        //         A collection designed for holding elements prior(order) to processing
        //         Linear data Structure
        //         operations:
        //         enqueue = offer() => added element from the front or head of the queue
        //         dequeue = poll() => added element from the rare or tail of the queue
        //         Queue in java is interface (linkedlist and prorityqueue implements this interface)

        Queue<String> queue = new LinkedList<>();

        queue.offer("Mike");
        queue.offer("jhon");
        queue.offer("albert");
        queue.offer("cherno");

        System.out.println(queue);


        System.out.println(queue.poll());
        System.out.println(queue.peek());


        //some other method of queue inherited from collection class

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.contains("jhon"));

        // Where are queues use-full?

        // 1 . Keyboard Buffer(letters should appear on the screen in the order they're passed) .
        // 2 . Printer Queue(Print Jobs should be completed in order) .
        // 3 . Used in LinkedLists,PriorityQueues,Breadth-first search .

    }
}