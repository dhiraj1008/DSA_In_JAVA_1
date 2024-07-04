import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // stack = LIFO data structure. Last-In-First-Out
        //         stores objects into a sort of vertical tower
        //         Linear data Structure
        //         Operations(Methods):
        //         push() to add the top
        //         pop() to remove from the top
        //         peek() to get the top of stack without removing the element from top
        //                 to check stack is empty or not

        //implementation :
        Stack<String> stack = new Stack<String>();
        boolean x = stack.empty();
        //System.out.println(x);
        //stack of video games
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.peek());

        //when stack is empty ur still popping the element then it will raise exception(EmptyStackException)

       /* stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
      */
        /*
        //what if we push 1 billion elements into a stack

        for(int i=0;i<1000000000;i++)
        {
            stack.push("hello");
        }
        //raise a Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        //heap - space in the memory for dynamic memory allocations..

        //Application of stack data structure :
        // uses of stack ?
        // 1. undo/redo features in text editors.
        // 2. moving back/forward through browser history
        // 3. backtracking algorithm(maze,file directory)
        // 4. calling functions(call stack)
    }

         */

    }
}
