class Solution {
    public int longestSubsequence(int[] arr, int diff) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int num : arr){
            int prev = num - diff;
            int len = map.getOrDefault(prev, 0) + 1;
            map.put(num, len);
            max = Math.max(max, len);
        }return max;
    }
}