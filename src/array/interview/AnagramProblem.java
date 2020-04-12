package array.interview;

import java.util.Arrays;

/**
 *
 * @author maidul
 */
public class AnagramProblem {

    boolean solution(String[] s1, String[] s2) {
        if (s1.length < s2.length || s1.length > s2.length) {
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].equalsIgnoreCase(s2[i])) {
                return false;
            }
        }
        return true;
    }
}
