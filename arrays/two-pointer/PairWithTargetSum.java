// Approach: Sort array, then use left and right pointers moving inward.
// Time: O(n log n)  Space: O(1)
import java.util.Arrays;

public class PairWithTargetSum {
    public static int[] findPair(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return new int[]{arr[left], arr[right]};
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{};
    }
}
