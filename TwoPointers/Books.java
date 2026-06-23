package TwoPointers;

public class Books {
    public static int maxBooks(int[] books, int k) {

    int l = 0;
    int sum = 0;
    int max = 0;
    int n = books.length;

    for (int r = 0; r < n; r++) {

        sum += books[r];

        while (sum > k) {
            sum -= books[l];
            l++;
        }

        max = Math.max(max, r - l + 1);
    }

    return max;
}
}
