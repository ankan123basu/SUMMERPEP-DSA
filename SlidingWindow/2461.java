import java.util.HashMap;
class Solution {

    public long maximumSubarraySum(int[] nums, int k) { // O(n) O(k)

        HashMap<Integer, Integer> map = new HashMap<>();

        long windowSum = 0;
        long maxSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k)
            maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {

            // Remove left element
            int left = nums[i - k];

            windowSum -= left;

            map.put(left, map.get(left) - 1);

            if (map.get(left) == 0)
                map.remove(left);

            // Add right element
            int right = nums[i];

            windowSum += right;

            map.put(right, map.getOrDefault(right, 0) + 1);

            // Check validity
            if (map.size() == k)
                maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}