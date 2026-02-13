package DSA.Arrays.Medium;

import java.util.HashMap;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum itself equals k
            if (sum == k) {
                maxLen = i + 1;
            }

            // If (sum - k) exists, then subarray sum = k
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Store first occurrence of sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10, 9};
        int k = 15;

        System.out.println(longestSubarray(arr, k));
    }
}
