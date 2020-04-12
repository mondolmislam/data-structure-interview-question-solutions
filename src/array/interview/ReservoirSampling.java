package array.interview;

import java.util.Random;

/**
 *
 * @author maidul
 */
public class ReservoirSampling {

    private Random random;

    public void ReservoirSampling() {
        this.random = new Random();
    }

    public void solution(int[] nums, int k) {
        // create an array for reservoir k items
        int[] reservoir = new int[k];
        // copy first k items from array nums
        for (int i = 0; i < reservoir.length; i++) {
            reservoir[i] = nums[i];
        }
        // we consider the items from the original array nums
        // k+1 because we have already copies k items
        // the i-th item is chosen to the included in the reservoir with probability k/i
        for (int i = k + 1; i < nums.length; i++) {
            random=new Random();
            int j = random.nextInt(i) + 1;
            if (j < k) {
                reservoir[j] = nums[i];
            }
        }
        // print the k random items
        for (int i = 0; i < reservoir.length; i++) {
            System.out.print(reservoir[i] + " ");
        }
    }
}
