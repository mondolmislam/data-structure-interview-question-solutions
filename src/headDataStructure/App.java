package headDataStructure;

/**
 *
 * @author maidul
 */
public class App {
    public static void main(String[] args) {
        Heap heap=new Heap(10);
        
        heap.insert(23);
        heap.insert(3);
        heap.insert(50);
        heap.insert(60);
        heap.insert(2);
        
        heap.heapsort();
        
        
    }
}
