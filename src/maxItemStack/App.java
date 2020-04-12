package maxItemStack;

/**
 *
 * @author maidul
 */
public class App {
    public static void main(String[] args) {
        MaxItemStack mis=new MaxItemStack();
        mis.push(12);
        mis.push(0);
        mis.push(30);
        mis.push(20);
        
        System.out.println(mis.getMaxItem());
    }
    
}
