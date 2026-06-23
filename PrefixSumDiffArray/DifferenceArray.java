package PrefixSumDiffArray;
import java.util.Arrays;
import java.util.Scanner;

public class DifferenceArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] diff = new int[n];
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int val = sc.nextInt();

            diff[L] += val;

            if (R + 1 < n) {
                diff[R + 1] -= val;
            }
        }

        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }
        
        System.out.println(Arrays.toString(diff));

        sc.close();
    }
}