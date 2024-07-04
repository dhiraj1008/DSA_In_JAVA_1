public class Main {
    //  merge sort = recursively divide array int 2 ,sort ,re-combine.
    //  run-time complexity - O(nlog n) - quasilinear run time .
    //  space complexity    - O(n) - it requires two sub array .
    public static void main(String[] args) {
        System.out.println("Merge Sort !");
        //implementation

       int[] array = {2,4,3,2,1,3,4,5,4,6,7,4,10,4,3,2};
        System.out.println("Before sorting :");
        for(int i:array){
            System.out.print(i+",");
        }
        mergeSort(array);
        System.out.println("\nAfter Sorting :");
        for(int i:array){
            System.out.print(i+",");
        }

    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <=1)  return;//base case

        int middle = length/2;
        int[]  left_array= new int[middle];
        int[]  right_array=new int[length-middle];
        int i=0;//left array
        int j=0;//right array
        for(;i<length;i++) {
            if(i<middle){
                left_array[i]=array[i];
        }
            else {
                right_array[j]=array[i];
                j++;
            }
        }

        mergeSort(left_array);
        mergeSort(right_array);
        mergeF(left_array,right_array,array);//helper function

    }

    private static void mergeF(int[] leftArray, int[] rightArray, int[] array) {
     int leftsize=array.length/2;
     int righsize=array.length-leftsize;
     int i=0,l=0,r=0;//indices
        while (l<leftsize && r<righsize)
        {
            if(leftArray[l]<rightArray[r]){
                array[i]=leftArray[l];
                i++;
                l++;
            }
            else
            {
                array[i]=rightArray[r];
                i++;
                r++;
            }
        }

        //there are still some lefts left in one of the arrays

        while (l<leftsize){
            array[i]=leftArray[l];
            l++;
            i++;
        }
        while (r<righsize)
        {
            array[i]=rightArray[r];
            i++;
            r++;

        }


    }

}