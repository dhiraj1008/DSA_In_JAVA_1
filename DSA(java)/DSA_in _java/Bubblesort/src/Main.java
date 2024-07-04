public class Main {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        // Bubble Sort : pairs of adjacent elements are compared ,
        // and the elements swapped if they are not in order.
        // Time Complexity : Quadratic time O(n^2)
        // small data set = okay but there are other efficient algo
        // large data set = BAD(plz don't use)

        int array[]={1,3,2,4,6,5,3,8,6,4,5,7,8,2};
        System.out.println("Before Sorting:");
       for(int i:array){
           System.out.println(i);
       }
        bubbleSort(array);
        System.out.println("After Sorting:");
        for(int i:array){
            System.out.println(i);
        }

    }

    private static void bubbleSort(int[] array) {
        for(int i=0;i< array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int  temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

    }
}