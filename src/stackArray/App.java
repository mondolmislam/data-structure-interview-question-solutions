package stackArray;

import java.util.Arrays;

/**
 *
 * @author maidul
 */
public class App {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(12);
        s.push(44);
        s.push(122);
        s.push(Integer.SIZE);
        s.push(64);
        System.out.println("List of data that inserted");
        s.display();
        System.out.println("Pop data "+s.pop());
        
    }
}
