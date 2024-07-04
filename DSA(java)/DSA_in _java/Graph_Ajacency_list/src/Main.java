import java.util.Hashtable;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Adjacency List = An array/arraylist of linked-list.
        //                  each ll has a unique node at the head
        //
        //                  runtime complexity to check an edge - O(v)
        //                  space complexity - O(v+e)

        System.out.println("Graph - Adjacency List ");

        Graph graph = new Graph();
        //let make index as nodes value so that we can check edges easily with the node name

        Hashtable<Character,Integer> hashtable=new Hashtable();

        graph.addNode(new Node('A'));
        hashtable.put('A',0);
        graph.addNode(new Node('B'));
        hashtable.put('B',1);
        graph.addNode(new Node('C'));
        hashtable.put('C',2);
        graph.addNode(new Node('D'));
        hashtable.put('D',3);
        graph.addNode(new Node('E'));
        hashtable.put('E',4);


        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);
        graph.addEdge(1,4);

        graph.print();

        System.out.println(graph.checkEdge(hashtable.get('A'),hashtable.get('B')));



    }
}