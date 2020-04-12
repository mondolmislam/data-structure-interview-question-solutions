package array.interview;

import java.util.Arrays;

public class AnagramTest {

    public static void main(String[] args) {
        String s1 = "restful";
        String s2 = "fluster";
        System.out.println(Arrays.toString(s1.trim().split("")));
        System.out.println(new AnagramProblem().solution(s1.trim().split(""), s2.trim().split("")));
    }
    
}
