import java.util.Hashtable;

public class Main {
    //BFS    -  a search algorithm for traversing a tree or graph ds .
    //          This is done one "level" at a time
    //          rather than one "branch" at a time (dfs)

    // Breadth First Search = Traverse a graph level by level
    //                        utilizes a queue
    //                        Better if destination is an average close to start
    //                        siblings are visited before children

    // Depth First Search = Traversing a graph  branch by branch
    //                       Utilizes a Stack
    //                       Better if a destination is on average far from the start
    //                       children are visited before siblings
    //                       more popular for game/puzzle


    public static void main(String[] args) {
        System.out.println("Breath First Search");
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

        graph.breathFirstSearch(0);


    }
}