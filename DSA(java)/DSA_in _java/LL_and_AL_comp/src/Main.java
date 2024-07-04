import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("LL vs Al !");


    // comparison b/w LinkedList and ArrayList:

    LinkedList<Integer> linkedList = new LinkedList<>();
    ArrayList<Integer> arrayList = new ArrayList<>();

    long startTime;
    long endTime;
    long elapsedTime;

    for(int i=0;i<1000000;i++) {
        linkedList.add(i);
        arrayList.add(i);
    }
    //****************LinkedList*****************
        startTime=System.nanoTime();//Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
        //linkedList.get(0);
        // linkedList.get(500000);
        //linkedList.get(999999);
        //linkedList.remove(0);
        //linkedList.remove(500000);
        linkedList.remove(999999);
        endTime=System.nanoTime();
        elapsedTime=endTime-startTime;
        System.out.println("LinkedList :"+elapsedTime);

        //****************ArrayList*****************
        startTime=System.nanoTime();//Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        arrayList.remove(999999);
        endTime=System.nanoTime();
        elapsedTime=endTime-startTime;
        System.out.println("ArrayList :"+elapsedTime);

      //if you have more data then insertion and deletion is best by LL but still AL is flexible in more pf the applications .

    }
}