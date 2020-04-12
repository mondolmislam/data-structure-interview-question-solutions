package array.interview;

/**
 *
 * @author maidul
 */
public class ReverseArray {

    // run time complexity is O(n)+in-place algorthme( no need for extra memory)
    public int[] reverse(int[] arr) {
        // point to the first item
        int startIndex = 0;
        // point to the last item
        int endIndex = arr.length - 1;
        while (endIndex >= startIndex) {
            //swap two item with startindex and endindex
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
        return arr;
    }

    private void swap(int[] arr, int startIndex, int endIndex) {
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }
}
