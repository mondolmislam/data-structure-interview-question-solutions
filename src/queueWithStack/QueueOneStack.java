/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueWithStack;

import java.util.Stack;

/**
 *
 * @author maidul
 */
public class QueueOneStack {
    private Stack<Integer> stack;

    public QueueOneStack() {
        this.stack=new Stack<>();
    }
    
    public void enqueue(int item){
        this.stack.push(item);
    }
    
    public int dequeue(){
        if(this.stack.size()==1){
            return this.stack.pop();
        }
        
        int item = this.stack.pop();
        int lastItem= dequeue();
        enqueue(item);
        
        return lastItem;
    }
}
