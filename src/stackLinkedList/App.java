package stackLinkedList;

/**
 *
 * @author maidul
 */
public class App {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("Alu");
        s.push("Begun");
        s.push("Morich");
        s.push("Labon");
        System.out.println(s.size());
        s.pop();
        System.out.println(s.size());
    }
}
