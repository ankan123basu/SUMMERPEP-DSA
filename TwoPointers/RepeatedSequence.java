package TwoPointers;

    import java.util.*;

public class RepeatedSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long S = sc.nextLong();

        long[] A = new long[N];
        long total = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            total += A[i];
        }

        // If S is exactly some no of cycles
        if (S % total == 0) {
            System.out.println("Yes");
            return;
        }

        long target = S % total;

        // Create array of 2N to handle wrapping of subarrays 
        long[] B = new long[2 * N];

        for (int i = 0; i < N; i++) {
            B[i] = A[i];
            B[i + N] = A[i];
        }

        long currSum = 0;
        int left = 0;

        for (int right = 0; right < 2 * N; right++) {

            currSum += B[right];
            while (currSum > target) {
                currSum -= B[left];
                left++;
            }

            if (currSum == target) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}

