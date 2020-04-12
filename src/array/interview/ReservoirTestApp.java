package array.interview;

/**
 *
 * @author maidul
 */
public class ReservoirTestApp {

    public static void main(String[] args) {
        int nums[] = {12, 3, 4, 35, 22, 44, 21, 323, 232, 22, 44, 232, 44, 55, 23, 11, 324, 55, 226, 45, 556, 33, 22, 112, 242};
        ReservoirSampling rs = new ReservoirSampling();
        int k = 5;//sampling items that you want to choose
        rs.solution(nums, k);
    }

}
