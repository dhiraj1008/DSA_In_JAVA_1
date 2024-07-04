import java.util.*;

public class Main {

    // Hashtable = A data structures that stores unique keys to value ex.<Integer,String>
    //             Each key/value pair is know as Entry .
    //             Fast insertion.look up,deletion of key/value pairs
    //             Not ideal for small data sets,great with large data sets .

    // hashing  = takes a key and computes a hash(integer)(formula will vary based on data type of key).
    //              In a Hashtable,we use the hash % capacity  to calculate an index number.
    //              In java:
    //              key.hashcode() % capacity = index

    // bucket  =  an indexed storage location for one or more entries.
    //            can store multiple Entries in case of a collision , this process is called "chaining"(linked similarly a linked-list)
    //
    //collision = hash function generates the same index for more than one key
    //            less collision = more efficiency

    // Runtime Complexity : Best case O(1)
    //                      Worst case O(n)

    //by increasing the size of hashtable we reduce the collision,but this will take the memory(space) so people will find the balance between it .

    //it will display the hashtable in descending order
    public static void main(String[] args) {

        System.out.println("Hashtable :");
    //implementation :
        Hashtable<Integer,String> table = new Hashtable<>(24);

        table.put(100,"Gary");
        table.put(121,"Patrick");
        table.put(123,"Spongebob");
        table.put(132,"Squid ward");
        table.put(120,"Sand");

//deletion

        table.remove(121);

        for(Integer key:table.keySet()){
            System.out.println(key.hashCode() % 24 +"\t"
                    +key+"\t"+table.get(key));
        }

    }
}