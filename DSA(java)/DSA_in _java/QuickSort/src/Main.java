public class Main {
    // quick sort = moves smaller elements left of a pivot .
    //              recursively divide array in 2 partitions

    // run-time complexity = Best case O(n log(n))
    //                       Average case O(n log(n))
    //                       Worst case O(n^2) if already sorted

    // space complexity = O(log(n)) due to recursion ..
    public static void main(String[] args) {

        System.out.println("Quick Sort :");

        // implementation:

        int[] array = {2,4,3,2,1,3,4,5,4,6,7,4,10,4,3,2};
        System.out.println("Before sorting :");
        for(int i:array){
            System.out.print(i+",");
        }
        quickSort(array,0,array.length-1);
        System.out.println("\nAfter Sorting :");
        for(int i:array){
            System.out.print(i+",");
        }
    }

    private static void quickSort(int[] array,int start,int end)
    {
        if(end<=start) return;//base case
        int pivot=partition(array,start,end);
        quickSort(array,start,pivot-1);
        quickSort(array,pivot+1,end);

    }

    //here they consider end as the pivot element .
    private static int partition(int[] array, int start, int end) {
    int pivot=array[end];
    int i=start-1;
    for (int j=start;j<=end-1;j++)
    {
        if(array[j]<pivot)
        {
            i++;
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }

    }
    i++;
    int temp=array[i];
    array[i]=pivot;
    array[end]=temp;
        System.out.println("\nhi");
        for(int x:array){
            System.out.print(x+",");
        }
        System.out.println("hi");
        return i;
    }
}