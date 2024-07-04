import java.util.Hashtable;

public class Main {

    //DFS -  a search algorithm for traversing a tree or graph data structure
    //       1) pick a route(start node)
    //       2) keep going until you reach a dead end or a previously visited node
    //       3) backtrack to last node that has unvisited adjacency neighbour
    //       example - maze solving
    public static void main(String[] args) {

        System.out.println("Depth First Search !");
//implementation
        // here we are gone use adjacency matrix to represent the graph

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

        graph.depthFirstSearch(4);

        /*
        boolean[] x=new boolean[3];

        System.out.println(x[0]); // by default it contains  "false" ..!

       */
    }
}