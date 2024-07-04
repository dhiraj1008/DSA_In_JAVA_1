import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dynamic Array :");
        //prebuilt dynamic array:
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("E");
        arrayList.add(2,"C");
        arrayList.remove("C");
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println("size :"+arrayList.size());

        //implementing own dynamic array
        System.out.println("Our Own Dynamic Array:");
       DynamicArray dynamicArray = new DynamicArray();

       dynamicArray.add("A");
       dynamicArray.add("B");
       dynamicArray.add("C");

       System.out.println(dynamicArray);
       System.out.println("size:"+dynamicArray.size);
       System.out.println("capacity:"+dynamicArray.capacity);

       dynamicArray.delete("A");
       dynamicArray.insert(1,"A");
        System.out.println(dynamicArray.search("B"));
        System.out.println(dynamicArray);
       System.out.println("empty:"+dynamicArray.isEmpty());


    }
}