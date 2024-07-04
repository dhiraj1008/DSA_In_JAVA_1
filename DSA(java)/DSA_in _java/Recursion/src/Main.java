public class Main {
    // recursion = When a thing is defined in terms of itself .
    //             Apply the result of a procedure,to a procedure.
    //             A recursive method calls itself . Can be a substitute for iteration
    //             Divide a problem into sub-problem of the same type as the original.
    //             Commonly used with advanced sorting algorithm and navigating trees

    //
    //             Advantages
    //             ----------
    //             easier to read/write
    //             easier to debug

    //             Disadvantages
    //             -----------
    //             sometimes slower
    //             use more memory(call stack)

    //                  recursion         vs       iterative
    //             repeating of procedure  |  repeating of process

    public static void main(String[] args) {

        System.out.println("Recursion  :");
        //iterative method
        System.out.println("Iterative way :");
        walkI(100);
        //recursive method
        System.out.println("\nRecursive way :");
        walkR(10000);
        // walkR(100000);// raises Exception StackOverflowError

        // Recursion Problems:

        //Factorial of a given number
        System.out.println("factorial of a give number is "+factorial(4));

        //power
        System.out.println("power of a given number is :"+power(2,8));
    }
  public  static  int factorial(int n)
  {
      if (n==1) return  1;//base case
      return  n*factorial(n-1);//recursive case

  }

  public static int power(int base,int power){
        if(power==1){
            return base;
        }
        return  base*power(base,power-1);

  }
    private static void walkR(int n) {
        if(n==0) return;//base case
        System.out.println("You take a step !");
        walkR(n-1); //recursive case

    }

    private static void walkI(int n) {
        for(int i=0;i<n;i++)
        {
            System.out.print("You take a step !,");
        }
    }

}