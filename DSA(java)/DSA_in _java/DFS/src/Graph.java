import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size)
    {   nodes = new ArrayList<>();
        matrix=new int[size][size];
    }

    void addNode(Node node)
    {
        nodes.add(node);
    }

    void addEdge(int src,int des){
        matrix[src][des]=1;
    }
    boolean checkEdge(int src,int det){
        if (matrix[src][det]==1)
            return  true;
        return  false;
    }

    //DFS Algorithm to traverse the graph

    public void depthFirstSearch(int start)
    {
        boolean[] visited =new boolean[matrix.length];
        dfsHelper(start,visited);

    }

    private void dfsHelper(int src, boolean[] visited) {
        // we are implementing by using recursion(this use recursive call stack)
        if(visited[src]){
            return;
        }
        else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " visited");
            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1) {
                    dfsHelper(i, visited);
                }
            }
        }
    }

    void print()
    {
        System.out.print("  ");
        for(Node i : nodes){
            System.out.print(i.data+" ");
        }
        System.out.println();
        for(int i=0;i< matrix.length;i++)
        {
            System.out.print(nodes.get(i).data+" ");
            for(int j=0;j< matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
