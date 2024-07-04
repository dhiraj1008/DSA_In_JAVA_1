import java.util.Hashtable;

public class Main {

    // Adjacency Matrix - It's a 2d array  to store 1's/0's to represent edge .
    //                    # of rows = # of unique nodes
    //                    # of columns = # of unique nodes

    //                    run time complexity  to check an edge = O(1)
    //                    space complexity = O(V^2) where v=vertices or # of nodes

    //implementation -
    public static void main(String[] args) {
        System.out.println("Graph representation : Adjacency Matrix : ");

        Graph graph = new Graph(5);
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
        System.out.println(graph.checkEdge(hashtable.get('A'),hashtable.get('D')));

    }
}