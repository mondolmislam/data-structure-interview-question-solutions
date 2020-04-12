/*
 * The aim is to design a queue abstract data type with the help of stacks.
 */
package queueWithStack;

import java.util.Stack;

/**
 *
 * @author maidul
 */
public class Queue {
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public Queue() {
        this.enqueueStack=new Stack<>();
        this.dequeueStack=new Stack<>();
    }
    
    public void push(int item){
        this.enqueueStack.push(item);
    }
    
    public int pop(){
        if(this.enqueueStack.isEmpty()&& this.dequeueStack.isEmpty()){
            throw new RuntimeException("Stack are empty....");
        }
        if(this.dequeueStack.isEmpty()){
            while(!this.enqueueStack.isEmpty()){
                this.dequeueStack.push(this.enqueueStack.pop());
            }
        }
        return this.dequeueStack.pop();
    }
}
