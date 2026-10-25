
import java.util.*;

class Solution {

    public static void conquer(
        int[] nums, int[] indices, int[] count,
        int si, int mid, int ei
    ) {
        int[] merge = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        int rightCount = 0;

        while (idx1 <= mid && idx2 <= ei) {

            if (nums[indices[idx2]] < nums[indices[idx1]]) {
                merge[x++] = indices[idx2++];
                rightCount++;
            } else {
                count[indices[idx1]] += rightCount;
                merge[x++] = indices[idx1++];
            }
        }

        while (idx1 <= mid) {
            count[indices[idx1]] += rightCount;
            merge[x++] = indices[idx1++];
        }

        while (idx2 <= ei) {
            merge[x++] = indices[idx2++];
        }

        for (int i = 0; i < merge.length; i++) {
            indices[si + i] = merge[i];
        }
    }

    public static void divide(
        int[] nums, int[] indices, int[] count,
        int si, int ei
    ) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        divide(nums, indices, count, si, mid);
        divide(nums, indices, count, mid + 1, ei);

        conquer(nums, indices, count, si, mid, ei);
    }

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;

        int[] indices = new int[n];
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        divide(nums, indices, count, 0, n - 1);

        List<Integer> result = new ArrayList<>();

        for (int value : count) {
            result.add(value);
        }

        return result;
    }
}
