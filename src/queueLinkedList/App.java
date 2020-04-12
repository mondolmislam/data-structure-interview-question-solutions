package queueLinkedList;

/**
 *
 * @author maidul
 */
public class App {
    public static void main(String[] args) {
        Queue<Integer> q=new Queue<>();
        q.enqueue(Integer.SIZE);
        q.enqueue(10);
        q.enqueue(30);
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
