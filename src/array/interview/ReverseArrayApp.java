package array.interview;

import java.util.Arrays;

/**
 *
 * @author maidul
 */
public class ReverseArrayApp {
    public static void main(String[] args) {
        int []arr={1,2,3,9,4,5,6,7,8};
        ReverseArray ra=new ReverseArray();
        System.out.println("Reverse array of data");
        System.out.println(Arrays.toString(ra.reverse(arr)));
    }
}
