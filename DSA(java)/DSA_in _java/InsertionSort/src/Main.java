public class Main {
    // insertion sort = after comparing elements to the left
    //                  shift elements to the right to make room to insert a value .
    //                  Here start outer loop with i=1;
    //
    //                  Quadratic time O(n^2)
    //                  small data set = decent
    //                  large data set = BAD

    //                  fewer steps than Bubble Sort
    //                  Best Case is O(n) compared to Selection Sort O(n^2)

    public static void main(String[] args) {

          System.out.println("Insertion Sort !");
           int[] array={9,1,8,2,7,3,6,5,4};

        System.out.println("Before sorting :");
            for (int i:array) {
                System.out.print(i+" ");
            }
            insertionSort(array);
            System.out.println("\nAfter Sorting :");
            for (int i:array) {
                System.out.print(i+" ");
            }





    }

    private static void insertionSort(int[] array) {
        for (int i=1;i< array.length;i++){
            int temp=array[i];
            int j=i-1;
            while (j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;

        }
    }
}