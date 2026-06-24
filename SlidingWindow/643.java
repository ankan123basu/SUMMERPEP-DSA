
    class Solution {
    public double findMaxAverage(int[] nums, int k) { // O(n) O(1)

        int windowSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;

        // Slide
        for (int i = k; i < nums.length; i++) {

            // Remove left and add new 
            windowSum = windowSum - nums[i - k] + nums[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}

