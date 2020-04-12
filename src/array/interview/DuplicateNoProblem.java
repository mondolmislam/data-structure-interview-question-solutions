package array.interview;

/**
 *
 * @author maidul
 */
public class DuplicateNoProblem {
    public void solution(int []arr){
        // O(N) complexity of that algorithm
        for (int i = 0; i < arr.length; i++) {
            // if the value is positive then the flip =negative
            if(arr[Math.abs(arr[i])]>0){
                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
            }else{ // otherwise the number is repeated.
                System.out.println(Math.abs(arr[i])+" is repeated.");
            }
        }
    }
}
