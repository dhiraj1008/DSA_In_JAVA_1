import java.util.ArrayList;
import java.util.LinkedList;

public class Graph{
    ArrayList<LinkedList<Node>> arrayList;

    Graph()
    {
        arrayList= new ArrayList<>();
    }
    void addNode(Node node)
    {
       LinkedList<Node> h_node = new LinkedList<>();
       h_node.add(node);
       arrayList.add(h_node);
    }

    void addEdge(int src,int des)
    {
        LinkedList<Node> c_list = arrayList.get(src);
        Node dstnode = arrayList.get(des).get(0);
        c_list.add(dstnode);
    }

    boolean checkEdge(int src,int des)
    {
        LinkedList<Node> c_list = arrayList.get(src);
        Node dstnode = arrayList.get(des).get(0);
        for(Node node:c_list){
            if(node==dstnode)
                return true;
        }
        return  false;
    }

    void print()
    {
     for(LinkedList<Node>  linkedList:arrayList){
         for(Node node : linkedList){
             System.out.print(node.data +"->");
         }
         System.out.println();
     }
    }
}
