package maxItemStack;
/*
The aim is to design an algorithm that can return the maximum item of a stack in O(1) running time complexity. We can use O(N) extra memory!
Hint: we can use another stack to track the max item
*/
import java.util.Stack;

/**
 *
 * @author maidul
 */
public class MaxItemStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    public MaxItemStack() {
        this.mainStack = new Stack<>();
        this.maxStack = new Stack<>();
    }
    
    public void push(int item){
        this.mainStack.push(item);
        if(this.mainStack.size()==1){
            this.maxStack.push(item);
        }
        if(item>this.maxStack.peek()){
            this.maxStack.push(item);
        }else{
            this.maxStack.push(this.maxStack.peek());
        }
    }
    
    public int getMaxItem(){
        return this.maxStack.peek();
    }

}
