public class Main {
    public static void main(String[] args) {
        System.out.println("Interpolation Search");
        //interpolation search :
         //                      normally : interpolation : estimating unknown values that lies b/w two data points .
         //                      technically in algo : improvement over binary search best used for "uniformly([1,2,3],[2,4,8])" distributed data .
        //                       "guesses" where a value might be based on calculated probe results
        //                       if probe is incorrect .search area is narrowed ,and a new prob is calculated .
        //                       TC:average case : O(log(log(n))
        //                           worst case :O(n) [values increase exponentially]

     int[] array = {1,2,3,4,5,6,7,8,10};
     int index=interpolationSearch(array,5);
        if (index!=-1)
            System.out.println("element found at index :"+index);
        else
            System.out.println("element not found");

    }

    private static int interpolationSearch(int[] array, int target) {
    int low=0;
    int high=array.length-1;
    int middle=0;
    while (array[low]<=target && array[high]>=target && low<=high){
        //guess
        int probe=low + (high-low)*(target-array[low])/(array[high]-low);
        System.out.println("probe:"+probe);
        if(array[probe]==target)
            return  probe;
        else if (array[probe]<target) {

            low=probe+1;
        }
        else {
            high=probe-1;
        }

    }
    return  -1;
    }
}