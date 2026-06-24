package TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountDistinct {
    public static List<Integer> countDistinct(int[] arr, int k) {

    List<Integer> ans = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < k; i++) {
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    ans.add(map.size());

    //*****sliding */
    for (int i = k; i < arr.length; i++) {

        // *remove left
        int left = arr[i - k];
        map.put(left, map.get(left) - 1);
        if (map.get(left) == 0) {
            map.remove(left);
        }

        // then add new
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        ans.add(map.size());
    }

    return ans;
}
}
