import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search !");
        //      Binary Search :
        //                     Searching algorithm that finds a position of a target value within a sorted array .
        //                     Half of the array is eliminated during each "step" .
        //                     Time Complexity : O(log n)
        //                     How : [1,2,3,4,5,6]
        //                          =>middle = 6/2 =3 check if [middle] is =,< , > depend on this next move is made
        //                          =>if element not found : middle = 3/2  repeat   " till only one element left .
        //                            => so sequence is in this pattern => 6/2,3/2,1,=>n/2,n/4,n/8 ....... n/n=> log2(n) =>number of times we need to divide n by 2 to get the result 1 .
        //Build in Method of Arrays;
        System.out.println(" Arrays Method :");
        int array[]=new int[100];
        int target=42;

        for(int i=0;i<array.length;i++){
            array[i]=i;
        }
        int index = Arrays.binarySearch(array,target);
        if (index<0)
            System.out.println(target+" element not found");
        else
            System.out.println(target+" element found");

        //By implementing our own method;
        System.out.println("Own method ");
        int array1[]=new int[1000000];

        int target1=300000;

        for(int i=0;i<array1.length;i++){
            array1[i]=i;
        }

        int index1 = binarySearch(array1,target1);
        if (index1==-1)
            System.out.println(target1+" element not found");
        else
            System.out.println(target1+" element found");

    }
 // Binary Search Method ..!

    private static int binarySearch(int[] array, int target) {
        int low=0;
        int high=array.length-1;
        int middle=0;
        //through loop :
       while (low<=high){
             middle=(low+high)/2;
           System.out.println("middle"+middle);
             if (array[middle]==target){
                 return middle;
             }
             else if (target<array[middle]){
                 high=middle-1;
             }
             else{
                 low=middle+1;
             }
        }

        //we can also  do through recursion :



        return -1;
    }
}