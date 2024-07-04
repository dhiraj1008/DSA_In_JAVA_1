public class Main {
    public static void main(String[] args) {
        System.out.println("Selection Sort !");
        // selection sort = search through an array and keep track of the minimum
        //                   value in each iteration.At the end of each iteration,
        //                   we swap variables(placing min element at the desired position)
        //                   and then start the nxt iteration next to of that placed min element.
        //
        //                   Quadratic time O(n^2)
        //                   small data set = okay
        //                   large data set = Bad

        //Implementation:
        int[] array = {3,4,2,1,8,7,9,2,3,1,5,4,6};
        System.out.println("Before Sorting :");
        for (int i:array) {
            System.out.println(i);
        }
        selectionSort(array);
        System.out.println("After Sorting :");
        for (int i:array) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        for(int i=0;i< array.length-1;i++){
            int mini=i;
            for (int j=i+1;j< array.length;j++)
            {
                if(array[j]<array[mini])
                {
                    mini=j;
                }
            }
            int temp=array[i];
            array[i]=array[mini];
            array[mini]=temp;

        }
    }
}