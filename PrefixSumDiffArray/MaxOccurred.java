package PrefixSumDiffArray;
import java.util.Scanner;

public class MaxOccurred {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] L = new int[n];
        int[] R = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {

            L[i] = sc.nextInt();
            R[i] = sc.nextInt();

            max = Math.max(max, R[i]);
        }

        int[] diff = new int[max + 2];

        for (int i = 0; i < n; i++) {

            diff[L[i]]++;

            diff[R[i] + 1]--;
        }

        int ans = 0;
        int maxFreq = diff[0];

        for (int i = 1; i <= max; i++) {

            diff[i] += diff[i - 1];

            if (diff[i] > maxFreq) {
                maxFreq = diff[i];
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
