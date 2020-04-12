package queueWithStack;

/**
 *
 * @author maidul
 */
public class App {

    public static void main(String[] args) {
        //using dobule stack
        Queue q = new Queue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        //using one stack
        QueueOneStack o = new QueueOneStack();
        o.enqueue(10);
        o.enqueue(20);
        o.enqueue(30);
        System.out.println(o.dequeue());
        System.out.println(o.dequeue());
        System.out.println(o.dequeue());
    }
}
