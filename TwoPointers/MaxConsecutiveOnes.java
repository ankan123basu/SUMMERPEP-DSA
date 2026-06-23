package TwoPointers;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;

        for (int num : nums) {

            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}
