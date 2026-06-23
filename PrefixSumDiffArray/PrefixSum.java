package PrefixSumDiffArray;
import java.util.Scanner;

public class PrefixSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            prefix[i + 1] = prefix[i] + arr[i];
        }

        
        int L = sc.nextInt();
        int R = sc.nextInt();

        int sum = prefix[R + 1] - prefix[L];

        System.out.println(sum);

        sc.close();
    }
}