import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        System.out.println("LINKED List");
        // LinkedList = stores Nodes in 2 parts(data + address)
        //              Nodes are in non-consecutive memory location
        //              Elements are linked using pointers
        //
        //                     Singly Linked List
        //              Node            Node         Node
        //             [data/addr] -> [data/addr] ->[data/addr]

        //                     Doubly Linked List
        //              Node                       Node                      Node
        //             [addr/data/addr] <->  [addr/data/addr] <-> [addr/data/addr]

        //             advantages :
        //             1)Dynamic Data Structure(allocates needed memory while running)
        //             2)Insertion and Deletion of nodes is easy.O(1)
        //             3)No/Low memory waste
        //
        //             disadvantages :
        //             1)Greater memory usage(additional pointer)
        //             2)No random access of elements (no index[i])
        //             3)Accessing/Searching elements is more time-consuming .O(n)

        //             uses?
        //             1)Implementing stacks and queues
        //             2)GPS navigation =>s->m1->m2->e
        //             3)music playlist

        // code:-

        LinkedList<String> linkedList = new LinkedList<String>();

        //implementing stack
        System.out.print("Implement stack");
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        linkedList.pop();



        System.out.println(linkedList);

        System.out.println(linkedList.peek());
        System.out.println();
        //implement queue

        LinkedList<String> linkedList_q = new LinkedList<>();
        System.out.print("Implement queue");
        linkedList_q.offer("A");
        linkedList_q.offer("B");
        linkedList_q.offer("C");
        linkedList_q.offer("D");
        linkedList_q.offer("E");

        System.out.println(linkedList_q);
        linkedList_q.poll();

        System.out.println("\n"+linkedList_q.remove("D") );
        linkedList_q.add(3,"F");


        linkedList_q.offer("G");
        linkedList_q.addFirst("H");
        linkedList_q.addLast("I");

        linkedList_q.remove(3);
        linkedList_q.removeFirst();
        linkedList_q.removeLast();


        System.out.println(linkedList_q);

        System.out.println(linkedList_q.indexOf("C"));
        //System.out.println(linkedList_q.peekFirst());
        //System.out.println(linkedList_q.peekLast());




    }


}