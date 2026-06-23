package TwoPointers;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {

    int l = 0;
    int r = arr.length - 1;

    while (l < r) {

        int sum = arr[l] + arr[r];

        if (sum == target) {
            return new int[]{l, r};
        }

        else if (sum < target) {
            l++;
        }

        else {
            r--;
        }
    }

    return new int[]{-1, -1};
}
}
