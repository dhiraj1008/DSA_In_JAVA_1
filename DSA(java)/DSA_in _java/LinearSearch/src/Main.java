public class Main {
    public static void main(String[] args) {

        System.out.println("Linear Search !");
        //linear search = Iterate through a collection one element at a time.
        //                runtime complexity = O(n)
        //
        //                Advantages :
        //                Fast for searches of small to medium data sets
        //                Does not need to sorted .
        //                Useful for data structures that do not have random access(LinkedList)

        //                DisAdvantages:
        //                slow for large data sets

        //code :

        int[] array = {1,3,4,6,7,2,8,10,9};
        int index=linearSearch(array,2);
        if(index==-1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at:"+index);
        }
    }

    private static int linearSearch(int[] array, int find) {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==find)
                return  i;
        }
        return -1;
    }

}