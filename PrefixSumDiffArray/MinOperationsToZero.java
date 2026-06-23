package PrefixSumDiffArray;
import java.util.Scanner;

public class MinOperationsToZero {

    public static int minOperations(int[] arr) {

        int operations = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Start new operations only if current element
            // is greater than the previous one
            if (arr[i] > arr[i - 1]) {
                operations += arr[i] - arr[i - 1];
            }
        }

        return operations;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = minOperations(arr);

        System.out.println(ans);

        sc.close();
    }
}